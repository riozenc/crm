/**
 * Title:DaoXml.java
 * Author:czy
 * Datetime:2016年11月6日 下午2:23:12
 */
package crm.test;

import java.io.IOException;

import com.riozenc.quicktool.common.util.ClassDAOXmlUtil;

import crm.webapp.acc.domain.DepartmentDomain;
import crm.webapp.acc.service.impl.CompanyServiceImpl;

public class DaoXml implements Cloneable {
	public static void main(String[] args) {
//		ClassDAOXmlUtil.buildXML("C:\\Users\\czy\\git\\crm\\src\\main\\java\\crm\\webapp\\acc\\dao",
//				"crm.webapp.acc.domain");
		
		try {
			ClassDAOXmlUtil.buildXML("C:\\Users\\czy\\git\\crm\\src\\main\\java\\crm\\webapp\\acc\\dao",
					DepartmentDomain.class,"DEPARTMENT_INFO");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println( CompanyServiceImpl.class instanceof Class);
		// DaoXml d1 = new DaoXml();
		// try {
		// DaoXml d2 = (DaoXml) d1.clone();
		//
		// System.out.println(d1);
		// System.out.println(d2);
		// } catch (CloneNotSupportedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}
}
