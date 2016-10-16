/**
 * @Project:crm
 * @Title:MenuEntity.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午7:40:50
 * 
 */
package crm.common.webapp.ump.entity;

/**
 * 菜单
 * 
 * @author rioze
 *
 */
public class MenuEntity {

	private Integer id;
	private String menuName;
	private String menuUrl;
	private Integer parentId;
	private Integer isLeaf;
	private Integer state;

	private Integer userId;
	private Integer sortNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

}
