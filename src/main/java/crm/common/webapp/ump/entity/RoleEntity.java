/**
 * @Project:crm
 * @Title:RoleEntity.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午7:13:19
 * 
 */
package crm.common.webapp.ump.entity;

/**
 * 角色
 * 
 * @author rioze
 *
 */
public class RoleEntity {

	private Integer id;
	// 角色名
	private String name;
	// 机构ID
	private Integer organId;
	// 角色说明
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrganId() {
		return organId;
	}

	public void setOrganId(Integer organId) {
		this.organId = organId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
