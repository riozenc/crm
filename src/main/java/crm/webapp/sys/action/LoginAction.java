/**
 * Title:LoginAction.java
 * Author:czy
 * Datetime:2016年9月18日 下午5:08:13
 */
package crm.webapp.sys.action;

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
	public String login(String username, String password, String userpass) {

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
