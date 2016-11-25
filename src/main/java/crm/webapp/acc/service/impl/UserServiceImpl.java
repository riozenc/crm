/**
 * Title:UserServiceImpl.java
 * Author:czy
 * Datetime:2016年11月9日 下午2:49:13
 */
package crm.webapp.acc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Qualifier;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;
import com.riozenc.quicktool.common.util.cryption.en.WebPasswordUtils;

import crm.webapp.acc.dao.CompanyDAO;
import crm.webapp.acc.dao.UserDAO;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.TbmtzlDomain;
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
	public UserDomain getUser(UserDomain userDomain) {
		// TODO Auto-generated method stub
		return userDAO.getUser(userDomain);
	}

	@Override
	public List<TbmtzlDomain> getTest() {
		// TODO Auto-generated method stub
		List<TbmtzlDomain> mtzlList = new ArrayList<TbmtzlDomain>();

		List<TbmtzlDomain> list1 = userDAO.getTest();
		List<TbmtzlDomain> list2 = userDAO1.getTest();
		Map<Long, TbmtzlDomain> map1 = new HashMap<Long, TbmtzlDomain>();
		Map<Long, TbmtzlDomain> map2 = new HashMap<Long, TbmtzlDomain>();

		for (TbmtzlDomain temp : list1) {
			map1.put(temp.getId(), temp);
		}
		for (TbmtzlDomain temp : list2) {
			map2.put(temp.getId(), temp);
		}

		for (Entry<Long, TbmtzlDomain> entry : map1.entrySet()) {
			TbmtzlDomain temp = map2.get(entry.getKey());
			if (entry.getValue().getJingDu() == null || entry.getValue().getWeiDu() == null || temp.getJingDu() == null
					|| temp.getWeiDu() == null) {
				mtzlList.add(entry.getValue());
				continue;
			}
			if (entry.getValue().getJingDu().floatValue() != temp.getJingDu().floatValue()) {
				entry.getValue().setRemark(
						"mtzl_JingDu:" + entry.getValue().getJingDu() + "=== log_JingDu:" + temp.getJingDu());
				mtzlList.add(entry.getValue());
			} else if (entry.getValue().getWeiDu().floatValue() != temp.getWeiDu().floatValue()) {

				entry.getValue()
						.setRemark("mtzl_WeiDu:" + entry.getValue().getWeiDu() + "=== log_WeiDu:" + temp.getWeiDu());
				mtzlList.add(entry.getValue());
			}
		}
		return mtzlList;
	}

}
