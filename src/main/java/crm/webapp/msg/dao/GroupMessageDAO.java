package crm.webapp.msg.dao;

import java.util.List;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.mybatis.dao.AbstractTransactionDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.msg.domain.GroupMessageDomain;

@TransactionDAO
public class GroupMessageDAO extends AbstractTransactionDAOSupport implements BaseDAO<GroupMessageDomain> {

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
		return null;
	}

}
