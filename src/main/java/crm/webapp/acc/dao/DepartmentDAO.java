/**
 * Title:DepartmentDAO.java
 * Author:czy
 * Datetime:2016年11月23日 下午5:26:39
 */
package crm.webapp.acc.dao;

import java.util.List;

import com.riozenc.quicktool.mybatis.dao.AbstractTransactionDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.domain.DepartmentDomain;

public class DepartmentDAO extends AbstractTransactionDAOSupport implements BaseDAO<DepartmentDomain> {

	@Override
	public int insert(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().delete(getNamespace() + ".delete", t);
	}

	@Override
	public int update(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", t);
	}

	@Override
	public DepartmentDomain findByKey(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", t);
	}

	@Override
	public List<DepartmentDomain> findByWhere(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
	}

}
