/**
 * Title:PasswordShiroFilter.java
 * Author:czy
 * Datetime:2016年10月24日 下午3:21:01
 */
package crm.common.security.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.riozenc.quicktool.common.util.StringUtil;



public class PasswordShiroFilter extends FormAuthenticationFilter {

	@Override
	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		String username = getUsername(request);
		String password = getPassword(request);
		if (password == null) {
			password = "";
		}
//		boolean rememberMe = isRememberMe(request);
//		String host = StringUtil.getRemoteAddr((HttpServletRequest) request);
//		String captcha = getCaptcha(request);
//		boolean mobile = isMobileLogin(request);
//		return new UsernamePasswordToken(username, password.toCharArray(), rememberMe, host, captcha, mobile);
	}
}
