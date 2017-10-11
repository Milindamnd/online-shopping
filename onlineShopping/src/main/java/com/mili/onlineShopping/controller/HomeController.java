package com.mili.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping(value= {"/" , "/index" , "/home"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("onClickHome",true);
		return mv;
		
	}
	public ModelAndView category() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","category");
		mv.addObject("onClickCategory",true);
		return mv;
		
	}
	
}
