package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;


/**
 * @author gting0518@163.com
 * @deacription  垃圾实体
 * @data 2019/10/16
 */
@Component
public class Rubbish {
	private Long id;//id，设置自增
	private String name;//垃圾名称
	private Long categoryId;//所属分类ID
	private RubbishCategory rubbishCategory;//所属分类
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public RubbishCategory getRubbishCategory() {
		return rubbishCategory;
	}
	public void setRubbishCategory(RubbishCategory rubbishCategory) {
		this.rubbishCategory = rubbishCategory;
	}
	
	
}
