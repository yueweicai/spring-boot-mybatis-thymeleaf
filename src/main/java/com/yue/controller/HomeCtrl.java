package com.yue.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yue.model.Product;
import com.yue.service.IProductService;

@RestController
public class HomeCtrl {
	@Resource
	private IProductService service;
	
	@RequestMapping("/products/{page}")
	public List<Product> getProducts(@PathVariable("page") int page){
		int count = 10;
		return service.findProduct(page,count);
	}
	
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int id){
		return service.getProduct(id);
	}
}
