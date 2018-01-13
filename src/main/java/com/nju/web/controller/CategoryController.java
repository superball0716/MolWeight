package com.nju.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nju.web.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping
	public ModelAndView getNames() {
		ModelAndView mv = new ModelAndView("categorytest");
		List<String> names = categoryService.getAllCategoryName();
		mv.addObject("names", names);
		return mv;
	}
}
