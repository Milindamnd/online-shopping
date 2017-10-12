package com.mili.onlineShopping.service;

import java.util.List;

import com.mili.onlineShopping.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public List<Product> getListOfAllProduct();
	
}
