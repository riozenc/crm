/**
 * Title:UserService.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:07:02
 */
package crm.webapp.acc.service;

import java.util.List;

import crm.common.webapp.base.service.BaseService;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.UserDomain;

public interface UserService extends BaseService<UserDomain> {

	public int insertUserRole(UserDomain userDomain, CompanyDomain companyDomain);

	public UserDomain getUser(UserDomain userDomain);
	
	public List<UserDomain> findUserByCompany(CompanyDomain companyDomain);
	
	public int insertList(List<UserDomain> list);

}
