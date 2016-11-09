/**
 * Title:CompanyAction.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:04:52
 */
package crm.webapp.acc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.quicktool.common.util.json.JSONUtil;

import crm.common.webapp.base.action.BaseAction;
import crm.webapp.acc.domain.CompanyDomain;
import crm.webapp.acc.service.CompanyService;

@ControllerAdvice
@RequestMapping("company")
public class CompanyAction extends BaseAction {

//	@Autowired
//	@Qualifier("companyServiceImpl")
//	private CompanyService companyService;
//
//	@ResponseBody
//	@RequestMapping(params = "type=insert")
//	public String insert(CompanyDomain companyInfoVO) {
//		int i = companyService.insert(companyInfoVO);
//		if (i > 0) {
//			return JSONUtil.writeSuccessMsg("新增成功.");
//		} else {
//			return JSONUtil.writeSuccessMsg("新增失败.");
//		}
//	}

}
