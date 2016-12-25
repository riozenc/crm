package crm.webapp.msg.service;

import java.util.List;

import crm.common.webapp.base.service.BaseService;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.domain.GroupMessageDomain;

public interface GroupMessageService extends BaseService<GroupMessageDomain> {
	public List<GroupMessageDomain> findUnReadMessage(UserDomain userDomain);
}
