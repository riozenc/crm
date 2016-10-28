/**
 * Title:RoleAction.java
 * Author:czy
 * Datetime:2016年10月28日 下午2:55:02
 */
package crm.common.webapp.ump.action;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import crm.common.webapp.base.action.BaseAction;
import crm.common.webapp.ump.entity.RoleEntity;

@ControllerAdvice
@RequestMapping("role")
public class RoleAction extends BaseAction {

	public void insertRole(RoleEntity roleEntity) {
		
	}
}
