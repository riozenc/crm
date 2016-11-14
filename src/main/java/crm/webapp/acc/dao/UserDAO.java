/**
 * @Project:crm
 * @Title:UserDAO.java
 * @Author:Riozenc
 * @Datetime:2016年11月8日 下午11:11:53
 * 
 */
package crm.webapp.acc.dao;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.mybatis.dao.AbstractDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.domain.UserDomain;

@TransactionDAO
public class UserDAO extends AbstractDAOSupport implements BaseDAO<UserDomain> {

	@Override
	public int insert(UserDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager(false).insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(UserDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(UserDomain t) {
		// TODO Auto-generated method stub
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

}
