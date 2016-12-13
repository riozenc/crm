/**
 * Title:MessageAction.java
 * Author:czy
 * Datetime:2016年11月21日 上午11:20:48
 */
package crm.webapp.msg.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.domain.MessageDomain;
import crm.webapp.msg.service.MessageService;

@ControllerAdvice
@RequestMapping("message")
public class MessageAction extends BaseAction {

	@Autowired
	@Qualifier("messageServiceImpl")
	private MessageService messageService;

	@ResponseBody
	@RequestMapping(params = "type=revice")
	public String reviceMessage(MessageDomain messageDomain) {
		messageService.insert(messageDomain);
		return JSONUtil.writeSuccessMsg("接收成功.");
	}

	/**
	 * 获取未读消息
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(params = "type=findUnReadMessage")
	public String findUnReadMessage() {
		UserDomain userDomain = UserUtils.getPrincipal().getUserDomain();

		MessageDomain messageDomain = new MessageDomain();
		messageDomain.setToId(userDomain.getId());
		messageDomain.setReceiveStatus(0);// 0未读
		List<MessageDomain> list = messageService.findByWhere(messageDomain);

		return JSONUtil.getJsonResult(list);
	}
}
