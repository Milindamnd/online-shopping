package com.mili.onlineShopping.dao;

import java.util.List;

import com.mili.onlineShopping.model.Product;

public interface ProductDao {
	public void addProduct(Product product);
	public List<Product> getListOfAllProduct();
}
