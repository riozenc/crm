/**
 * Title:GroupInfoVO.java
 * Author:czy
 * Datetime:2016年9月13日 下午6:35:02
 */
package crm.webapp.acc.vo;

/**
 * 群组
 * 
 * @author czy
 *
 */
public class GroupInfoVO {

	private Long id;// ID ID bigint TRUE FALSE TRUE
	private String groupNo;// GROUP_NO 群组号 char(15) 15 FALSE FALSE FALSE
	private String groupName;// GROUP_NAME 群组名称 char(30) 30 FALSE FALSE FALSE
	private Integer groupType;// GROUP_TYPE 群组类别 int FALSE FALSE FALSE
	private Integer status;// STATUS 状态 int FALSE FALSE FALSE

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
