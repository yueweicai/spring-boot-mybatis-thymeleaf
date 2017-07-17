package com.yue.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yue.mapper.ProductMapper;
import com.yue.model.Product;
@Service
public class ProductService implements IProductService {
	@Resource
	private ProductMapper mapper;
	@Override
	public List<Product> findProduct(int page,int count) {
		PageHelper.startPage(page,count);
		return mapper.selectAll();
	}
	@Override
	public Product getProduct(int id) {
		return mapper.selectOne(id);
	}

}
