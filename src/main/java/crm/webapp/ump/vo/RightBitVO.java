/**
 * @Project:crm
 * @Title:RightBitEntity.java
 * @Author:Riozenc
 * @Datetime:2016年10月16日 下午7:51:18
 * 
 */
package crm.webapp.ump.vo;

public class RightBitVO {
	private Integer id;
	private Integer rightCode;
	private String rightName;
	private String rightDescribe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRightCode() {
		return rightCode;
	}

	public void setRightCode(Integer rightCode) {
		this.rightCode = rightCode;
	}

	public String getRightName() {
		return rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public String getRightDescribe() {
		return rightDescribe;
	}

	public void setRightDescribe(String rightDescribe) {
		this.rightDescribe = rightDescribe;
	}

}
