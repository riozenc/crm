/**
 * @Project:crm
 * @Title:RoleMenuRelEntity.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午7:49:49
 * 
 */
package crm.webapp.ump.vo;

/**
 * 角色菜单关系
 * 
 * @author rioze
 *
 */
public class RoleMenuRelVO {
	private Integer id;
	private Integer roleId;
	private Integer menuId;
	private Integer button;
	private Integer operator;
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getButton() {
		return button;
	}

	public void setButton(Integer button) {
		this.button = button;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
