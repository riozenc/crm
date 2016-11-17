/**
 * @Project:crm
 * @Title:PasswordShiroRealm.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午8:04:07
 * 
 */
package crm.common.security.realm;

import javax.annotation.PostConstruct;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import crm.common.security.token.UsernamePasswordToken;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.UserService;

public class PasswordShiroRealm extends AuthorizingRealm {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	// userServiceImpl,RIOZENC_userServiceImpl

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
		getCredentialsMatcher();
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		if (username != null && !"".equals(username.trim())) {
			UserDomain userDomain = userService.getLoginUser(new UserDomain(token));
			if (userDomain != null) {
				return new SimpleAuthenticationInfo(userDomain.getUserName(), userDomain.getPassword(),
						ByteSource.Util.bytes("czy"), getName());
			}
		}

		return null;
	}

	@PostConstruct
	public void initCredentialsMatcher() {
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher("SHA-1");
		matcher.setHashIterations(1024);
		setCredentialsMatcher(matcher);
	}
}
