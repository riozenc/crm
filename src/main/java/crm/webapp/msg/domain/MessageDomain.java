/**
 * Title:MessageDomain.java
 * Author:czy
 * Datetime:2016年11月20日 下午3:24:02
 */
package crm.webapp.msg.domain;

import java.util.Date;

import com.riozenc.quicktool.annotation.TablePrimaryKey;
import com.riozenc.quicktool.mybatis.MybatisEntity;

public class MessageDomain implements MybatisEntity {

	@TablePrimaryKey
	private Long id;// ID ID bigint TRUE FALSE TRUE
	private String message;// 消息 MESSAGE varchar(50) 50 FALSE FALSE FALSE
	private String fromId;// 发送者 FROM bigint FALSE FALSE FALSE
	private String toId;// 接收者 TO bigint FALSE FALSE FALSE
	private String fromIp;// 发送者IP FROM_IP char(15) 15 FALSE FALSE FALSE
	private String toIp;// 接收者IP TO_IP char(15) 15 FALSE FALSE FALSE
	private Integer fromTerminal;// 发送者设备 FROM_TERMINAL int FALSE FALSE FALSE
	private Integer toTerminal;// 接收者设备 TO_TERMINAL int FALSE FALSE FALSE
	private Date datetime;// 发送时间 DATE datetime FALSE FALSE FALSE

	private Integer receiveStatus;// 接收状态 RECEIVE_STATUS int FALSE FALSE FALSE
	private Integer readStatus;// 读取状态
	private Integer status;// STATUS STATUS int FALSE FALSE FALSE

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getToId() {
		return toId;
	}

	public void setToId(String toId) {
		this.toId = toId;
	}

	public String getFromIp() {
		return fromIp;
	}

	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}

	public String getToIp() {
		return toIp;
	}

	public void setToIp(String toIp) {
		this.toIp = toIp;
	}

	public Integer getFromTerminal() {
		return fromTerminal;
	}

	public void setFromTerminal(Integer fromTerminal) {
		this.fromTerminal = fromTerminal;
	}

	public Integer getToTerminal() {
		return toTerminal;
	}

	public void setToTerminal(Integer toTerminal) {
		this.toTerminal = toTerminal;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Integer getReceiveStatus() {
		return receiveStatus;
	}

	public void setReceiveStatus(Integer receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	public Integer getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(Integer readStatus) {
		this.readStatus = readStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
