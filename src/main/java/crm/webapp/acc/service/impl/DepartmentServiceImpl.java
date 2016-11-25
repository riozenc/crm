/**
 * Title:DepartmentServiceImpl.java
 * Author:czy
 * Datetime:2016年11月24日 上午9:44:00
 */
package crm.webapp.acc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crm.webapp.acc.dao.DepartmentDAO;
import crm.webapp.acc.domain.DepartmentDomain;
import crm.webapp.acc.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	public int insert(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return departmentDAO.insert(t);
	}

	@Override
	public int delete(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return departmentDAO.delete(t);
	}

	@Override
	public int update(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return departmentDAO.update(t);
	}

	@Override
	public DepartmentDomain findByKey(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return departmentDAO.findByKey(t);
	}

	@Override
	public List<DepartmentDomain> findByWhere(DepartmentDomain t) {
		// TODO Auto-generated method stub
		return departmentDAO.findByWhere(t);
	}

}
