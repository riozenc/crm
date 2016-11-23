/**
 * Title:DepartmentDomain.java
 * Author:czy
 * Datetime:2016年11月23日 下午5:24:58
 */
package crm.webapp.acc.domain;

public class DepartmentDomain {

	private Long id;// ID ID bigint FALSE FALSE FALSE
	private String name;// 部门名称 NAME varchar(20) 20 FALSE FALSE FALSE
	private Long parentId;// 上级部门 PARENT_ID bigint FALSE FALSE FALSE
	private String function;// 部门职能 FUNCTION varchar(20) 20 FALSE FALSE FALSE
	private String remark;// 备注 REMARK varchar(100) 100 FALSE FALSE FALSE
	private Integer status;// 状态 STATUS int FALSE FALSE FALSE

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
