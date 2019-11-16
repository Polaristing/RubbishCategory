package com.ischoolbar.programmer.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.Role;

/**
 * @author gting0518@163.com
 * @deacription  ½ÇÉ«service½Ó¿Ú
 * @data 2019/10/16
 */
@Service
public interface RoleService {
	public int add(Role role);
	public int edit(Role role);
	public int delete(Long id);
	public List<Role> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public Role find(Long id);
}
