package crm.common.json;

import com.riozenc.quicktool.mybatis.persistence.Page;

public class JsonGrid {
	private Integer totalRow;
	private Integer pageCurrent;
	private Object list;

	public JsonGrid(Page<?> page, Object list) {
		this.totalRow = page.getTotalRow();
		this.pageCurrent = page.getPageCurrent();
		this.list = list;
	}

	public Integer getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(Integer totalRow) {
		this.totalRow = totalRow;
	}

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public Object getList() {
		return list;
	}

	public void setList(Object list) {
		this.list = list;
	}

}
