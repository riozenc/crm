/**
 * Title:UserAction.java
 * Author:czy
 * Datetime:2016年9月13日 下午6:44:52
 */
package crm.webapp.acc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.webapp.base.action.BaseAction;
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
		int i = userService.insert(userDomain);
		if (i > 0) {
			return JSONUtil.writeSuccessMsg("新增成功.");
		} else {
			return JSONUtil.writeSuccessMsg("新增失败.");
		}
	}

}
