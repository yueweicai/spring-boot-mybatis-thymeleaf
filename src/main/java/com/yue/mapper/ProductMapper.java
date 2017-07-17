package com.yue.mapper;

import java.util.List;
import com.yue.model.Product;

public interface ProductMapper {
	public List<Product> selectAll();
	public Product selectOne(int id);
}
