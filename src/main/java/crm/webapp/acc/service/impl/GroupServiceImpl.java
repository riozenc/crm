/**
 * Title:GroupServiceImpl.java
 * Author:czy
 * Datetime:2016年11月21日 上午11:35:33
 */
package crm.webapp.acc.service.impl;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;

import crm.webapp.acc.dao.GroupDAO;
import crm.webapp.acc.domain.GroupDomain;
import crm.webapp.acc.service.GroupService;

@TransactionService
public class GroupServiceImpl implements GroupService {

	@TransactionDAO
	private GroupDAO groupDAO;

	@Override
	public int insert(GroupDomain t) {
		// TODO Auto-generated method stub
		return groupDAO.insert(t);
	}

	@Override
	public int delete(GroupDomain t) {
		// TODO Auto-generated method stub
		return groupDAO.delete(t);
	}

	@Override
	public int update(GroupDomain t) {
		// TODO Auto-generated method stub
		return groupDAO.update(t);
	}

	@Override
	public GroupDomain findByKey(GroupDomain t) {
		// TODO Auto-generated method stub
		return groupDAO.findByKey(t);
	}

	@Override
	public List<GroupDomain> findByWhere(GroupDomain t) {
		// TODO Auto-generated method stub
		return groupDAO.findByWhere(t);
	}

}
