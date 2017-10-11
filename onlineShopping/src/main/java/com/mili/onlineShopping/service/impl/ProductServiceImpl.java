package com.mili.onlineShopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mili.onlineShopping.dao.ProductDao;
import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);

	}

}
