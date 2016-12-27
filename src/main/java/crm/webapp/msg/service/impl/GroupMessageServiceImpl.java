package crm.webapp.msg.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;

import crm.common.security.util.UserUtils;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.dao.GroupMessageDAO;
import crm.webapp.msg.domain.GroupMessageDomain;
import crm.webapp.msg.service.GroupMessageService;

@TransactionService
public class GroupMessageServiceImpl implements GroupMessageService {

	@TransactionDAO
	private GroupMessageDAO groupMessageDAO;

	@Override
	public int insert(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.insert(t);
	}

	@Override
	public int delete(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.delete(t);
	}

	@Override
	public int update(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.update(t);
	}

	@Override
	public GroupMessageDomain findByKey(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.findByKey(t);
	}

	@Override
	public List<GroupMessageDomain> findByWhere(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return groupMessageDAO.findByWhere(t);
	}

	@Override
	public List<GroupMessageDomain> findUnReadMessage(UserDomain userDomain) {
		// TODO Auto-generated method stub

		return groupMessageDAO.findUnReadMessage(userDomain);
	}

	@Override
	public int refreshViewTime(String groupNo) {
		// TODO Auto-generated method stub
		UserDomain userDomain = UserUtils.getPrincipal().getUserDomain();
		Map<String, Object> map = new HashMap<>(2);
		map.put("1", userDomain.getId());
		map.put("2", groupNo);
		return groupMessageDAO.refreshViewTime(map);
	}
}
