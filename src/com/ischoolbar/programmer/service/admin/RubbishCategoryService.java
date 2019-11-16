package com.ischoolbar.programmer.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.RubbishCategory;

/**
 * @author gting0518@163.com
 * @deacription  垃圾分类用户service
 * @data 2019/10/16
 */
@Service
public interface RubbishCategoryService {
	public RubbishCategory findByName(String name);
	public int add(RubbishCategory rubbishCategory);
	public int edit(RubbishCategory rubbishCategory);
	public int delete(Long id);
	public List<RubbishCategory> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public List<RubbishCategory> findByCommon(String name);
}
