package com.spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spr.model.Shop;
import com.spr.service.IShopService;

@RestController
@RequestMapping(value = "/services")
public class RestJavaScriptsController {

	@Autowired
	private IShopService shopService;

	@RequestMapping(value = "/fetch/{id}", method=RequestMethod.GET, produces={"application/json"})
	public Shop fetchShopDataById(@PathVariable Integer id) {
		Shop shop = shopService.findById(id);
		return shop;
	}

}
