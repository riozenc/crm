/**
 * Title:GroupAction.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:06:31
 */
package crm.webapp.acc.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.GroupDomain;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.acc.service.GroupService;

@ControllerAdvice
@RequestMapping("group")
public class GroupAction extends BaseAction {

	@Autowired
	@Qualifier("groupServiceImpl")
	private GroupService groupservice;

	@ResponseBody
	@RequestMapping(params = "type=getGroupByUser")
	public String getGroupByUser() {
		UserDomain userDomain = UserUtils.getPrincipal().getUserDomain();
		List<GroupDomain> list = groupservice.findGroupByUser(userDomain);
		return JSONUtil.toJsonString(list);
	}

	@ResponseBody
	@RequestMapping(params = "type=getGroupInfo")
	public String getGroupInfo(GroupDomain groupDomain) {
		GroupDomain group = groupservice.getGroupInfo(groupDomain);
		return JSONUtil.toJsonString(group);
	}

}
