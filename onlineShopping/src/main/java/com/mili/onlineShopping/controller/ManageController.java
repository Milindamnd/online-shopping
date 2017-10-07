package com.mili.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/manage")
public class ManageController {

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView manageProduct() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("onClickManageProduct",true);
		mv.addObject("title","Manage Product");
		return mv;
		
	}
}
