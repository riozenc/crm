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

	@TransactionDAO("master")
	private UserDAO userDAO;

	@TransactionDAO("slave")
	private UserDAO userDAO1;

	@TransactionDAO("slave")
	private CompanyDAO companyDAO;

	@Override
	public int insert(UserDomain t) {
		// TODO Auto-generated method stub
		t.setPassword(WebPasswordUtils.encodePassword(t.getPassword()));
		return userDAO.insert(t);
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
			t.setPassword(WebPasswordUtils.encodePassword(t.getPassword()));
		}
		return 0;
	}

	@Override
	public UserDomain findByKey(UserDomain t) {
		// TODO Auto-generated method stub
		return userDAO.findByKey(t);
	}

	@Override
	public List<UserDomain> findByWhere(UserDomain t) {
		// TODO Auto-generated method stub
		return userDAO.findByWhere(t);
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
	public UserDomain getUser(UserDomain userDomain) {
		// TODO Auto-generated method stub
		return userDAO.getUser(userDomain);
	}

	@Override
	public List<UserDomain> getUserByCompany(CompanyDomain companyDomain) {
		// TODO Auto-generated method stub
		return userDAO.getUserByCompany(companyDomain);
	}

}
