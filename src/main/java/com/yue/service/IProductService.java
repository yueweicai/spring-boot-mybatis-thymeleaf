package com.yue.service;

import java.util.List;

import com.yue.model.Product;

public interface IProductService {
	public List<Product> findProduct(int page,int count);
	public Product getProduct(int id);
}
