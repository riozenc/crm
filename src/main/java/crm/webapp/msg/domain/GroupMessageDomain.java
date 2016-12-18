package crm.webapp.msg.domain;

import java.util.Date;

public class GroupMessageDomain {
	private Long id;// ID bigint 20 0 0 -1 0 0 0 0 -1 0
	private String message;// MESSAGE varchar 4096 0 -1 0 0 0 0 0 utf8
							// utf8_general_ci 0 0
	private String fromId;// FROM_ID varchar 20 0 -1 0 0 0 0 0 utf8
							// utf8_general_ci 0 0
	private String toId;// TO_ID varchar 15 0 -1 0 0 0 0 0 utf8 utf8_general_ci
						// 0 0
	private String fromName;// FROM_NAME varchar 15 0 -1 0 0 0 0 0 utf8
							// utf8_general_ci 0 0
	private Date date;// DATE datetime 0 0 -1 0 0 0 0 0 0 0
	private Integer status;// STATUS int 11 0 -1 0 0 0 0 0 0 0

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

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
