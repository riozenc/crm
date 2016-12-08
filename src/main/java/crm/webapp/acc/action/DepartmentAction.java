/**
 * Title:DepartmentAction.java
 * Author:czy
 * Datetime:2016年11月24日 上午9:47:23
 */
package crm.webapp.acc.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.DepartmentDomain;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.DepartmentService;
import crm.webapp.acc.service.UserService;

@ControllerAdvice
@RequestMapping("department")
public class DepartmentAction extends BaseAction {

	@Autowired
	@Qualifier("departmentServiceImpl")
	private DepartmentService departmentService;

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@RequestMapping(params = "type=insert")
	public String insert(DepartmentDomain departmentDomain) {
		if (departmentService.insert(departmentDomain) == 1) {
			return JSONUtil.writeSuccessMsg("添加成功.");
		} else {
			return JSONUtil.writeSuccessMsg("添加失败.");
		}
	}

	@ResponseBody
	@RequestMapping(params = "type=getDepartment")
	public String getDepartment(DepartmentDomain departmentDomain) {
		List<DepartmentDomain> list = departmentService.findByWhere(departmentDomain);
		return JSONUtil.getJsonResult(list);
	}

	@ResponseBody
	@RequestMapping(params = "type=getDeparmentByCompany")
	public String getDeparmentByCompany(CompanyDomain companyDomain) {
		List<DepartmentDomain> list = departmentService.getDeparmentByCompany(companyDomain);

		List<UserDomain> userList = userService.getUserByCompany(companyDomain);

		return JSONUtil.getJsonResult(list);
	}
}
