/**
 * Title:Principal.java
 * Author:czy
 * Datetime:2016年11月27日 上午10:58:02
 */
package crm.common.security;

import java.util.Date;

import crm.webapp.acc.domain.UserDomain;

public class Principal {

	private String userId; // 登录名
	private String userName; // 姓名
	private String phone;//
	private String mailAddress;
	private Integer sex;// SEX 性别 int FALSE FALSE FALSE
	private String imageUrl;// IMAGE_URL 头像 varchar(20) 20 FALSE FALSE FALSE
	private boolean mobileLogin; // 是否手机登录
	private Date createDate;// 创建时间 CREATE_DATE datetime
	private Date lastLoginDate;// 最后登陆时间 LAST_LOGIN_DATE datetime
	private Date updateDate;// 最后更新时间 UPDATE_DATE datetime

	private UserDomain userDomain;

	public Principal() {

	}

	public Principal(UserDomain userDomain) {
		userDomain.setPassword("Want password?");
		this.userDomain = userDomain;
		this.userId = userDomain.getUserId();
		this.userName= userDomain.getUserName();
		this.phone = userDomain.getPhone();
		this.mailAddress = userDomain.getMailAddress();
		this.sex = userDomain.getSex();
		this.imageUrl = userDomain.getImageUrl();
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public boolean isMobileLogin() {
		return mobileLogin;
	}

	public void setMobileLogin(boolean mobileLogin) {
		this.mobileLogin = mobileLogin;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public UserDomain getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(UserDomain userDomain) {
		this.userDomain = userDomain;
	}

}
