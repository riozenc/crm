/**
 * Title:TbmtzlDomain.java
 * Author:czy
 * Datetime:2016年11月25日 下午3:50:50
 */
package crm.webapp.acc.domain;

import com.riozenc.quicktool.mybatis.MybatisEntity;

public class TbmtzlDomain implements MybatisEntity{
	private Long id;
	private Float jingDu;
	private Float weiDu;
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getJingDu() {
		return jingDu;
	}

	public void setJingDu(Float jingDu) {
		this.jingDu = jingDu;
	}

	public Float getWeiDu() {
		return weiDu;
	}

	public void setWeiDu(Float weiDu) {
		this.weiDu = weiDu;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
