/**
 * Title:DepartmentService.java
 * Author:czy
 * Datetime:2016年11月24日 上午9:43:06
 */
package crm.webapp.acc.service;

import java.util.List;

import crm.common.webapp.base.service.BaseService;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.DepartmentDomain;

public interface DepartmentService extends BaseService<DepartmentDomain> {

	public List<DepartmentDomain> getDeparmentByCompany(CompanyDomain companyDomain);
}
