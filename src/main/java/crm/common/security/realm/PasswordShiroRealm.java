/**
 * @Project:crm
 * @Title:PasswordShiroRealm.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午8:04:07
 * 
 */
package crm.common.security.realm;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.HashService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;
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
		matcher.setHashIterations(1024);// 迭代1024次
		setCredentialsMatcher(matcher);
	}

	public static void main(String[] args) {

		byte[] bytes = new byte[8];
		new SecureRandom().nextBytes(bytes);
		byte[] salt = bytes;
		String plain = StringEscapeUtils.unescapeHtml4("5566");

		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("SHA-1");
			if (salt != null) {
				digest.update(salt);
			}

			byte[] result = digest.digest(plain.getBytes());

			for (int i = 1; i < 1024; i++) {
				digest.reset();
				result = digest.digest(result);
			}

			System.out.println(new String(Hex.encodeHex(salt)) + new String(Hex.encodeHex(result)));
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// MD2 MD5 SHA-1 SHA-256 SHA-384 SHA-512
		ByteSource.Util.bytes("5566");
		ByteSource.Util.bytes(Base64.decode("5566"));

		System.out.println(new SimpleHash("SHA-1", Base64.decode("5566"), Base64.decode("czy"), 1024));
		System.out.println(new SimpleHash("SHA-1", "5566", "czy", 1024));

		String s1 = Base64.encodeToString("5566".getBytes());
		String s2 = Base64.decodeToString(s1);

		try {
			System.out.println("czy".getBytes("UTF-8").toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
		System.out.println(s2);

		DefaultHashService hashService = new DefaultHashService();
		hashService.setHashAlgorithmName("SHA-512");
		hashService.setHashIterations(1024);
		hashService.setPrivateSalt(new SimpleByteSource("55"));

		DefaultPasswordService defaultPasswordService = new DefaultPasswordService();
		defaultPasswordService.setHashService(hashService);

		System.out.println(defaultPasswordService.hashPassword("5566").toBase64());

		System.out.println(defaultPasswordService.encryptPassword("5566"));
		System.out.println(defaultPasswordService.encryptPassword(s1));
		System.out.println(defaultPasswordService.encryptPassword(s2));
	}
}
