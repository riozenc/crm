/**
 * Title:UserAction.java
 * Author:czy
 * Datetime:2016年9月13日 下午6:44:52
 */
package crm.webapp.acc.action;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;
import com.riozenc.quicktool.mybatis.db.DbFactory;

import crm.common.security.Principal;
import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.UserService;

@ControllerAdvice
@RequestMapping("user")
public class UserAction extends BaseAction {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@ResponseBody
	@RequestMapping(params = "type=insert")
	public String insert(UserDomain userDomain) {

		if (userDomain.getPassword() == null) {
			return "密码不能为空...";
		}

		int i = userService.insert(userDomain);
		if (i == 1) {
			return JSONUtil.writeSuccessMsg("新增成功.");
		} else {
			return JSONUtil.writeSuccessMsg("新增失败(" + i + ").");
		}
	}

	@ResponseBody
	@RequestMapping(params = "type=getUserById")
	public String getUserById(UserDomain userDomain) {
		UserDomain user = userService.findByKey(userDomain);
		return JSONUtil.toJsonString(user);
	}

	@ResponseBody
	@RequestMapping(params = "type=getLoginUser")
	public String getLoginUser() {

		Principal principal = UserUtils.getPrincipal();

		// UserDomain user = userService.getUser(userDomain);
		return JSONUtil.toJsonString(principal.getUserDomain());
	}

	@ResponseBody
	@RequestMapping(params = "type=test1")
	public String test1() {

		UserDomain userDomain = new UserDomain();
		userDomain.setUserId("adsads");

		CompanyDomain companyDomain = new CompanyDomain();
		companyDomain.setCompanyNo("3");

		userService.insertUserRole(userDomain, companyDomain);
		return null;
	}

	@ResponseBody
	@RequestMapping(params = "type=test2")
	public String test2() {
		UserDomain userDomain = new UserDomain();
		userDomain.setUserId("adsads");

		userService.insert(userDomain);
		return null;
	}

	
}
