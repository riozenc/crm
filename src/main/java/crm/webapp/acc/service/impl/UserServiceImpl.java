/**
 * Title:UserServiceImpl.java
 * Author:czy
 * Datetime:2016年11月9日 下午2:49:13
 */
package crm.webapp.acc.service.impl;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;
import com.riozenc.quicktool.common.util.cryption.en.WebPasswordUtils;

import crm.webapp.acc.dao.CompanyDAO;
import crm.webapp.acc.dao.UserDAO;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.UserService;

@TransactionService
public class UserServiceImpl implements UserService {

	@TransactionDAO
	private UserDAO userDAO;
	@TransactionDAO("slave")
	private CompanyDAO companyDAO;

	@Override
	public int insert(UserDomain t) {
		// TODO Auto-generated method stub
		try {
			t.setPassword(WebPasswordUtils.encodePassword(t.getPassword()));
			return userDAO.insert(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getClass().hashCode();
		}
	}

	@Override
	public int delete(UserDomain t) {
		// TODO Auto-generated method stub
		return userDAO.delete(t);
	}

	@Override
	public int update(UserDomain t) {
		// TODO Auto-generated method stub

		if (t.getPassword() != null) {
			// t.setPassword(HashUtils.getHash(algorithmName, bytes, salt,
			// hashIterations));
		}
		return 0;
	}

	@Override
	public UserDomain findByKey(UserDomain t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDomain> findByWhere(UserDomain t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUserRole(UserDomain userDomain, CompanyDomain companyDomain) {
		userDAO.insert(userDomain);
		String s = null;
		companyDAO.insert(companyDomain);
		s.toString();
		return 1;
	}

	@Override
	public UserDomain getLoginUser(UserDomain userDomain) {
		// TODO Auto-generated method stub
		return userDAO.getLoginUser(userDomain);
	}

}
