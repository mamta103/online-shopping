package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CatagoryDAO;
import net.kzn.shoppingbackend.dto.Catagory;

@Controller
public class PageController {

	@Autowired
	private CatagoryDAO catagoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring WEB MVC ");
		mv.addObject("title", "Home");
		// Passing list of catatogies
		mv.addObject("catagories", catagoryDAO.list());
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About US");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact US");
		mv.addObject("userClickContact", true);
		return mv;

	}
	/*
	 * Method to load all the products and based on catagory
	 */

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		// Passing list of catatogies
		mv.addObject("catagories", catagoryDAO.list());
		
		mv.addObject("userClickAllProducts", true);
		return mv;

	}

	
	@RequestMapping(value = "/show/catagory/{id}/products")
	public ModelAndView showCatagoryProducts( @PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("page");
		
		//CatagoryDAO to fetch single catagory
		Catagory catagory = null;
		catagory = catagoryDAO.get(id);
		
		mv.addObject("title", catagory.getName());
		
		// Passing list of catatogies
		mv.addObject("catagories", catagoryDAO.list());
				
		// Passing list of catatogies
		mv.addObject("catagory", catagory);
				
		mv.addObject("userClickCatagoryProducts", true);
		return mv;

	}

}