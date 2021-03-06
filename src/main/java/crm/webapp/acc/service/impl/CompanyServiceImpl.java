/**
 * Title:CompanyServiceImpl.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:10:48
 */
package crm.webapp.acc.service.impl;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;

import crm.webapp.acc.dao.CompanyDAO;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.CompanyService;

@TransactionService
public class CompanyServiceImpl implements CompanyService {

	@TransactionDAO
	private CompanyDAO companyDAO;;

	@Override
	public int insert(CompanyDomain t) {
		// TODO Auto-generated method stub
		return companyDAO.insert(t);
	}

	@Override
	public int delete(CompanyDomain t) {
		// TODO Auto-generated method stub
		return companyDAO.delete(t);
	}

	@Override
	public int update(CompanyDomain t) {
		// TODO Auto-generated method stub
		return companyDAO.update(t);
	}

	@Override
	public CompanyDomain findByKey(CompanyDomain t) {
		// TODO Auto-generated method stub
		return companyDAO.findByKey(t);
	}

	@Override
	public List<CompanyDomain> findByWhere(CompanyDomain t) {
		// TODO Auto-generated method stub
		return companyDAO.findByWhere(t);
	}

	@Override
	public CompanyDomain getCompanyByUser(UserDomain userDomain) {
		// TODO Auto-generated method stub
		return companyDAO.getCompanyByUser(userDomain);
	}

}
