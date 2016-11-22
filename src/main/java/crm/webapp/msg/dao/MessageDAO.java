/**
 * Title:MessageDAO.java
 * Author:czy
 * Datetime:2016年11月20日 下午3:23:30
 */
package crm.webapp.msg.dao;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.mybatis.dao.AbstractTransactionDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.msg.domain.MessageDomain;

@TransactionDAO
public class MessageDAO extends AbstractTransactionDAOSupport implements BaseDAO<MessageDomain> {

	@Override
	public int insert(MessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(MessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().delete(getNamespace() + ".delete", t);
	}

	@Override
	public int update(MessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", t);
	}

	@Override
	public MessageDomain findByKey(MessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", t);
	}

	@Override
	public List<MessageDomain> findByWhere(MessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
	}

}
