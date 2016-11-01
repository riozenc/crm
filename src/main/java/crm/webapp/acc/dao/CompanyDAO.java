/**
 * Title:CompanyDAO.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:11:43
 */
package crm.webapp.acc.dao;

import java.util.List;

import com.riozenc.quicktool.mybatis.dao.AbstractDAOSupport;
import com.riozenc.quicktool.mybatis.dao.BaseDAO;

import crm.webapp.acc.vo.CompanyInfoVO;

public class CompanyDAO extends AbstractDAOSupport implements BaseDAO<CompanyInfoVO> {

	@Override
	public int insert(CompanyInfoVO t) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(this.getClass(), t);
	}

	@Override
	public int delete(CompanyInfoVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CompanyInfoVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CompanyInfoVO findByKey(CompanyInfoVO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyInfoVO> findByWhere(CompanyInfoVO t) {
		// TODO Auto-generated method stub
		return null;
	}

}
