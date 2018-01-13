package com.nju.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.web.mapper.CategoryMapper;
import com.nju.web.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public List<String> getAllCategoryName() {
		// TODO Auto-generated method stub
		return categoryMapper.getAllCategoryName();
	}

}
