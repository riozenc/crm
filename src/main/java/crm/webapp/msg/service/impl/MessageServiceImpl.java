/**
 * Title:MessageServiceImpl.java
 * Author:czy
 * Datetime:2016年11月21日 上午11:22:36
 */
package crm.webapp.msg.service.impl;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.annotation.TransactionService;

import crm.webapp.msg.dao.MessageDAO;
import crm.webapp.msg.domain.MessageDomain;
import crm.webapp.msg.service.MessageService;

@TransactionService
public class MessageServiceImpl implements MessageService {

	@TransactionDAO
	private MessageDAO messageDAO;

	@Override
	public int insert(MessageDomain t) {
		// TODO Auto-generated method stub
		return messageDAO.insert(t);
	}

	@Override
	public int delete(MessageDomain t) {
		// TODO Auto-generated method stub
		return messageDAO.delete(t);
	}

	@Override
	public int update(MessageDomain t) {
		// TODO Auto-generated method stub
		return messageDAO.update(t);
	}

	@Override
	public MessageDomain findByKey(MessageDomain t) {
		// TODO Auto-generated method stub
		return messageDAO.findByKey(t);
	}

	@Override
	public List<MessageDomain> findByWhere(MessageDomain t) {
		// TODO Auto-generated method stub
		return messageDAO.findByWhere(t);
	}

}
