package com.ischoolbar.programmer.page.admin;

import org.springframework.stereotype.Component;

/**
 * @author gting0518@163.com
 * @deacription  分页基本信息
 * @data 2019/10/16
 */
@Component
public class Page {
	private int page = 1;//当前页码
	
	private int rows;//每页显示数量
	
	private int offset;//对应数据库中的偏移量

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getOffset() {
		this.offset = (page - 1) * rows;
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
}
