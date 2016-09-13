/**
 * Title:UserInfoVO.java
 * Author:czy
 * Datetime:2016年9月13日 下午6:23:33
 */
package crm.webapp.acc.vo;

/**
 * 用户
 * 
 * @author czy
 *
 */
public class UserInfoVO {

	private String id;// ID 用户号 char(20) 20 TRUE FALSE TRUE
	private String userId;// USER_ID 用户自定义ID char(20) 20 TRUE FALSE TRUE
	private String phone;// PHONE 电话 char(11) 11 FALSE FALSE FALSE
	private String mailAddress;// MAIL_ADDRESS 邮箱地址 char(20) 20 FALSE FALSE FALSE
	private String userName;// USER_NAME 用户名称 char(15) 15 FALSE FALSE FALSE
	private Integer sex;// SEX 性别 int FALSE FALSE FALSE
	private String imageUrl;// IMAGE_URL 头像 varchar(20) 20 FALSE FALSE FALSE
	private Integer status;// STATUS 状态 int FALSE FALSE FALSE

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
