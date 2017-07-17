package com.yue.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.yue.model.Product;
import com.yue.service.IProductService;

@Controller
public class IndexCtrl {
	@Resource
	private IProductService service;
	@RequestMapping("/templates/{page}")
	public String index(ModelMap model,@PathVariable("page") int page){
		int count = 10;
		List<Product> beans = service.findProduct(page, count);
		int max = ((Page)beans).getPages();
		int cp = ((Page)beans).getPageNum();
		int[] nums = new int[max];
		for(int i=1;i<=max;i++){
			nums[i-1] = i;
		}
		List<Product> ps = new ArrayList<Product>();
		for(Product p : beans){
			ps.add(p);
		}
		model.put("ps", ps);
		model.put("nums", nums);
		model.put("cp", cp);
		return "index";
	}
}
