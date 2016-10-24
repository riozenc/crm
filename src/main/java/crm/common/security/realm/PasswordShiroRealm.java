/**
 * @Project:crm
 * @Title:PasswordShiroRealm.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午8:04:07
 * 
 */
package crm.common.security.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class PasswordShiroRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// TODO Auto-generated method stub
		System.out.println("doGetAuthorizationInfo");
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("doGetAuthenticationInfo");

		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		if (username != null && !"".equals(username)) {
			// User user = accountService.getUserByUserName(username);
			// if (user != null) {
			return new SimpleAuthenticationInfo("czy", "123456", getName());
			// }
		}

		return null;
	}

}
