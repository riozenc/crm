package crm.webapp.msg.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.domain.GroupMessageDomain;
import crm.webapp.msg.domain.MessageDomain;
import crm.webapp.msg.service.GroupMessageService;

@ControllerAdvice
@RequestMapping("groupMessage")
public class GroupMessageAction extends BaseAction {

	@Autowired
	@Qualifier("groupMessageServiceImpl")
	private GroupMessageService groupMessageService;

	/**
	 * 获取未读消息
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(params = "type=findUnReadMessage")
	public String findUnReadMessage() {
		UserDomain userDomain = UserUtils.getPrincipal().getUserDomain();

		groupMessageService.findUnReadMessage(userDomain);
		return null;
	}

	@ResponseBody
	@RequestMapping(params = "type=updateOperTime")
	public String updateOperTime(String userId, String groupId) {

		return null;
	}

}
