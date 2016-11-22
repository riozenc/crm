/**
 * Title:MessageAction.java
 * Author:czy
 * Datetime:2016年11月21日 上午11:20:48
 */
package crm.webapp.msg.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import crm.common.webapp.base.action.BaseAction;
import crm.webapp.msg.domain.MessageDomain;
import crm.webapp.msg.service.MessageService;

@ControllerAdvice
@RequestMapping("message")
public class MessageAction extends BaseAction {

	@Autowired
	@Qualifier("messageServiceImpl")
	private MessageService messageService;

	@RequestMapping(params = "type=revice")
	public void reviceMessage(MessageDomain messageDomain) {
		messageService.insert(messageDomain);
	}
}
