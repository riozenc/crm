/**
 * Title:GroupAction.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:06:31
 */
package crm.webapp.acc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.service.GroupService;

@ControllerAdvice
@RequestMapping("group")
public class GroupAction extends BaseAction {

	@Autowired
	@Qualifier("groupServiceImpl")
	private GroupService groupservice;

	public String getGroupByUser() {
		
		

		UserUtils.getPrincipal().getUserDomain();
		return null;

	}
}
