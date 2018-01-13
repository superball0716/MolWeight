package com.nju.web.mapper;

import java.util.List;

import com.nju.web.model.Category;

public interface CategoryMapper {
	List<String> getAllCategoryName();

	int deleteByPrimaryKey(Integer id);

	int insert(Category record);

	int insertSelective(Category record);

	Category selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Category record);

	int updateByPrimaryKey(Category record);
}