package crm.webapp.msg.dao;

import java.util.List;
import java.util.Map;

import com.riozenc.quicktool.annotation.TransactionDAO;
import com.riozenc.quicktool.mybatis.dao.AbstractTransactionDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.domain.GroupMessageDomain;

@TransactionDAO
public class GroupMessageDAO extends AbstractTransactionDAOSupport implements BaseDAO<GroupMessageDomain> {

	@Override
	public int insert(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().delete(getNamespace() + ".delete", t);
	}

	@Override
	public int update(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", t);
	}

	@Override
	public GroupMessageDomain findByKey(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", t);
	}

	@Override
	public List<GroupMessageDomain> findByWhere(GroupMessageDomain t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
	}

	public int refreshViewTime(Map<?, ?> map) {
		return getPersistanceManager().update(getNamespace() + ".refreshViewTime", map);
	}

	public List<GroupMessageDomain> findUnReadMessage(UserDomain userDomain) {
		return getPersistanceManager().find(getNamespace() + ".findUnReadMessage", userDomain);
	}

}
