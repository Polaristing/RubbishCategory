package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;


/**
 * @author gting0518@163.com
 * @deacription  ����ʵ��
 * @data 2019/10/16
 */
@Component
public class Rubbish {
	private Long id;//id����������
	private String name;//��������
	private Long categoryId;//��������ID
	private RubbishCategory rubbishCategory;//��������
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
