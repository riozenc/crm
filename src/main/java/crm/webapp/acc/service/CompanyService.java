/**
 * Title:CompanyService.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:08:56
 */
package crm.webapp.acc.service;

import crm.common.webapp.base.service.BaseService;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.UserDomain;

public interface CompanyService extends BaseService<CompanyDomain> {
	public CompanyDomain getCompanyByUser(UserDomain userDomain);
}
