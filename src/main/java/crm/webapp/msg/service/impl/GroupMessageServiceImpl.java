package crm.webapp.msg.service.impl;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;

import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.dao.GroupMessageDAO;
import crm.webapp.msg.domain.GroupMessageDomain;
import crm.webapp.msg.domain.MessageDomain;
import crm.webapp.msg.service.GroupMessageService;

@TransactionService
public class GroupMessageServiceImpl implements GroupMessageService {

	@TransactionDAO
	private GroupMessageDAO groupMessageDAO;

	@Override
	public int insert(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GroupMessageDomain findByKey(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupMessageDomain> findByWhere(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.findByWhere(t);
	}

	@Override
	public List<GroupMessageDomain> findUnReadMessage(UserDomain userDomain) {
		// TODO Auto-generated method stub
		
		
		

		return null;
	}

}
