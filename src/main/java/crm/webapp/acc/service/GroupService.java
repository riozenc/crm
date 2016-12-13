/**
 * Title:GroupService.java
 * Author:czy
 * Datetime:2016年10月31日 下午4:09:12
 */
package crm.webapp.acc.service;

import java.util.List;

import crm.common.webapp.base.service.BaseService;
import crm.webapp.acc.domain.GroupDomain;
import crm.webapp.acc.domain.UserDomain;

public interface GroupService extends BaseService<GroupDomain> {

	public List<GroupDomain> findGroupByUser(UserDomain userDomain);

	public GroupDomain getGroupInfo(GroupDomain groupDomain);
}
