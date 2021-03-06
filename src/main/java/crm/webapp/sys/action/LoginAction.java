/**
 * Title:LoginAction.java
 * Author:czy
 * Datetime:2016年9月18日 下午5:08:13
 */
package crm.webapp.sys.action;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.servlet.ShiroHttpServletResponse;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.riozenc.quicktool.common.util.StringUtils;
import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.cache.LoginSessionCache;
import crm.common.security.Principal;
import crm.common.security.filter.PasswordShiroFilter;
import crm.common.webapp.base.action.BaseAction;

/**
 * 登录
 * 
 * @author czy
 *
 */
@ControllerAdvice
@RequestMapping("loginAction")
public class LoginAction extends BaseAction {

	@ResponseBody
	@RequestMapping(value = "/test")
	public String test(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		System.out.println("ttt");
		return login(httpServletRequest, httpServletResponse);
	}

	@ResponseBody
	@RequestMapping(params = "type=test1")
	public String test1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

		System.out.println(httpServletRequest.getRequestURI());
		
		System.out.println("ttt111");
		return login(httpServletRequest, httpServletResponse);
	}
	
	@ResponseBody
	@RequestMapping(params = "type=test2")
	public String test2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

		System.out.println("ttt222");
		return login(httpServletRequest, httpServletResponse);
	}

	@ResponseBody
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

		String errorClassName = (String) httpServletRequest
				.getAttribute(PasswordShiroFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (errorClassName == null) {
			// 成功
			Subject subject = SecurityUtils.getSubject();
			Principal principal = (Principal) subject.getPrincipal();

			if (principal == null) {
				// 非法请求
				return loginFail("IncorrectCredentialsException", httpServletRequest, httpServletResponse);
			}

			LoginSessionCache.put(principal.getUserId(), subject.getSession().getId());

			return JSONUtil.writeSuccessMsg("登录成功,欢迎" + principal.getUserName() + "!");
		} else {
			// 失败
			System.out.println(errorClassName);

			return loginFail(errorClassName, httpServletRequest, httpServletResponse);
		}
	}

	// DisabledAccountException （禁用的帐号）
	// LockedAccountException （锁定的帐号）
	// UnknownAccountException（错误的帐号）
	// ExcessiveAttemptsException（登录失败次数过多）
	// IncorrectCredentialsException （错误的凭证）
	// ExpiredCredentialsException （过期的凭证）
	public String loginFail(String errorClassName, HttpServletRequest request, HttpServletResponse response) {

		String username = WebUtils.getCleanParam(request, PasswordShiroFilter.DEFAULT_USERNAME_PARAM);
		boolean rememberMe = WebUtils.isTrue(request, PasswordShiroFilter.DEFAULT_REMEMBER_ME_PARAM);
		boolean mobile = WebUtils.isTrue(request, PasswordShiroFilter.DEFAULT_MOBILE_PARAM);
		String exception = (String) request.getAttribute(PasswordShiroFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		String message = (String) request.getAttribute(PasswordShiroFilter.DEFAULT_MESSAGE_PARAM);

		if (StringUtils.isBlank(message)) {
			message = "用户或密码错误, 请重试.";
		}

		// 非授权异常，登录失败，验证码加1。
		if (!UnauthorizedException.class.getName().equals(exception)) {
			isValidateCodeLogin(username, true, false);
			// model.addAttribute("isValidateCodeLogin", true);
		}

		// 验证失败清空验证码
		// request.getSession().setAttribute(ValidateCodeServlet.VALIDATE_CODE,
		// IdGen.uuid());

		// // 如果是手机登录，则返回JSON字符串
		// if (mobile) {
		// return renderString(response, model);
		// }

		return JSONUtil.writeErrorMsg(message);
	}

	@RequestMapping(value = "/logout")
	public String logout(String username, String password) {
		Subject subject = SecurityUtils.getSubject();
		SecurityUtils.getSecurityManager().logout(subject);

		return null;
	}

	public static boolean isValidateCodeLogin(String useruame, boolean isFail, boolean clean) {
		Map<String, Integer> loginFailMap = null;// (Map<String, Integer>)
													// CacheUtils.get("loginFailMap");
		if (loginFailMap == null) {
			loginFailMap = Maps.newHashMap();
			// CacheUtils.put("loginFailMap", loginFailMap);
		}
		Integer loginFailNum = loginFailMap.get(useruame);
		if (loginFailNum == null) {
			loginFailNum = 0;
		}
		if (isFail) {
			loginFailNum++;
			loginFailMap.put(useruame, loginFailNum);
		}
		if (clean) {
			loginFailMap.remove(useruame);
		}
		return loginFailNum >= 3;
	}

}
