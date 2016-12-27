package crm.webapp.msg.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.security.util.UserUtils;
import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.UserDomain;
import crm.webapp.msg.domain.GroupMessageDomain;
import crm.webapp.msg.service.GroupMessageService;

@ControllerAdvice
@RequestMapping("groupMessage")
public class GroupMessageAction extends BaseAction {

	@Autowired
	@Qualifier("groupMessageServiceImpl")
	private GroupMessageService groupMessageService;

	@ResponseBody
	@RequestMapping(params = "type=revice")
	public String reviceGroupMessage(GroupMessageDomain groupMessageDomain) {
		groupMessageDomain.setDate(new Date());
		groupMessageDomain.setStatus(1);
		int i = groupMessageService.insert(groupMessageDomain);
		if (i > 0) {
			return JSONUtil.writeSuccessMsg("新增成功.");
		} else {
			return JSONUtil.writeErrorMsg("新增失败.");
		}
	}

	/**
	 * 获取未读消息
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(params = "type=findUnReadMessage")
	public String findUnReadMessage() {

		UserDomain userDomain = UserUtils.getPrincipal().getUserDomain();

		List<GroupMessageDomain> list = groupMessageService.findUnReadMessage(userDomain);
		return JSONUtil.getJsonResult(list);
	}

	@ResponseBody
	@RequestMapping(params = "type=refreshViewTime")
	public String refreshViewTime(String groupNo) {

		int i = groupMessageService.refreshViewTime(groupNo);
		if (i > 0) {
			return JSONUtil.writeSuccessMsg("刷新成功.");
		} else {
			return JSONUtil.writeErrorMsg("刷新错误.");
		}
	}
}
