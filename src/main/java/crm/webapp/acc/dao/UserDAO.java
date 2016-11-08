/**
 * @Project:crm
 * @Title:UserDAO.java
 * @Author:Riozenc
 * @Datetime:2016年11月8日 下午11:11:53
 * 
 */
package crm.webapp.acc.dao;

import com.riozenc.quicktool.annotation.MybatisDAO;

@MybatisDAO
public interface UserDAO {
	public int insert();
}
