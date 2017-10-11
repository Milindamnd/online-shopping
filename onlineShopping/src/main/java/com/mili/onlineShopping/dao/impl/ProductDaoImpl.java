package com.mili.onlineShopping.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mili.onlineShopping.dao.ProductDao;
import com.mili.onlineShopping.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

}
