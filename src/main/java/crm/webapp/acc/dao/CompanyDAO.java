/**
 * Title:CompanyDAO.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:11:43
 */
package crm.webapp.acc.dao;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.mybatis.dao.AbstractTransactionDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.domain.CompanyDomain;

@TransactionDAO
public class CompanyDAO extends AbstractTransactionDAOSupport implements BaseDAO<CompanyDomain> {

	@Override
	public int insert(CompanyDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(CompanyDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().delete(getNamespace() + ".insert", t);
	}

	@Override
	public int update(CompanyDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".insert", t);
	}

	@Override
	public CompanyDomain findByKey(CompanyDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".insert", t);
	}

	@Override
	public List<CompanyDomain> findByWhere(CompanyDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".insert", t);
	}

}
