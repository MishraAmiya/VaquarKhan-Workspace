package com.spr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spr.model.Customer;
import com.spr.model.Shop;
import com.spr.repository.dao.ICustomerDao;
import com.spr.service.ICusomerService;
import com.spr.service.IShopService;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController {

	@Autowired
	private ICusomerService icusomerService;

	@RequestMapping(value = "/prodFetch/{id}", method=RequestMethod.GET, produces={"application/json"})
		public Customer fetchShopDataById(@PathVariable Integer id) {
		Customer customer = icusomerService.findById(id);
		return customer;
	}

	

	
	@RequestMapping(value = "/productList", method=RequestMethod.GET, produces={"application/json"})

	public ModelAndView productListPage() {
		ModelAndView mav = new ModelAndView("product");
		List<Customer> productList = icusomerService.findAll();
		mav.addObject("productList", productList);
		return mav;
	}
}
