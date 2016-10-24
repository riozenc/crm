/**
 * Title:IndexAction.java
 * Author:czy
 * Datetime:2016年10月24日 下午2:54:51
 */
package crm.webapp.sys.action;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
@RequestMapping("indexAction")
public class IndexAction {

	@RequestMapping(params = "type=index")
	public String index() {
		return "index.jsp";
	}
}
