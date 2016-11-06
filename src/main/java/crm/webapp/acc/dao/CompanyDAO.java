/**
 * Title:CompanyDAO.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:11:43
 */
package crm.webapp.acc.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.riozenc.quicktool.mybatis.dao.AbstractDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.domain.CompanyDomain;

@Service
public class CompanyDAO extends AbstractDAOSupport implements BaseDAO<CompanyDomain> {

	@Override
	public int insert(CompanyDomain t) {
		// TODO Auto-generated method stub
		System.out.println(getNamespace());
		return getPersistanceManager("slave").insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(CompanyDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CompanyDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CompanyDomain findByKey(CompanyDomain t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyDomain> findByWhere(CompanyDomain t) {
		// TODO Auto-generated method stub
		return null;
	}

}
