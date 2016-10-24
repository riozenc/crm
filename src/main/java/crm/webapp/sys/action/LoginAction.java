/**
 * Title:LoginAction.java
 * Author:czy
 * Datetime:2016年9月18日 下午5:08:13
 */
package crm.webapp.sys.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping(value = "/login")
	public String login(String username, String password, String userpass,HttpServletRequest httpServletRequest) {

		String errorClassName = (String) httpServletRequest.getAttribute("shiroLoginFailure");
		
//		DisabledAccountException （禁用的帐号）
//		LockedAccountException （锁定的帐号）
//		UnknownAccountException（错误的帐号）
//		ExcessiveAttemptsException（登录失败次数过多）
//		IncorrectCredentialsException （错误的凭证）
//		ExpiredCredentialsException （过期的凭证）

		System.out.println(username);
		System.out.println(password);
		System.out.println(userpass);

		return null;
	}

	@RequestMapping(value = "/logout")
	public String logout(String username, String password) {

		System.out.println(username);
		System.out.println(password);

		return null;
	}

}
