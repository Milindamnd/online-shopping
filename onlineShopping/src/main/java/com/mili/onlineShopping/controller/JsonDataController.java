package com.mili.onlineShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.ProductService;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	ProductService productService;
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product>getAllProduct(){
		return productService.getListOfAllProduct() ;
		
	}
}
