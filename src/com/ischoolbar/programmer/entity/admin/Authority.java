package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
 * @author gting0518@163.com
 * @deacription  权限实体
 * @data 2019/10/16
 */
@Component
public class Authority {
	private Long id;
	
	private Long roleId;//角色id
	
	private Long menuId;//菜单id

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	
}
