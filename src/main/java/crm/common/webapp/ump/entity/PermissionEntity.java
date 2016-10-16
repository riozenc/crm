/**
 * @Project:crm
 * @Title:PermissionEntity.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午7:30:40
 * 
 */
package crm.common.webapp.ump.entity;

/**
 * 权限
 * 
 * @author rioze
 *
 */
public class PermissionEntity {

	private Integer id;
	// token**/
	private String token;
	// 资源url**/
	private String url;
	// 权限说明**/
	private String description;
	// 所属角色编号**/
	private Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
