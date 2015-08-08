package com.spr.repository.dao;

import java.util.List;

import com.spr.exception.ShopNotFound;
import com.spr.model.Customer;

public interface ICustomerDao {
	
	public Customer create(Customer customer);
	public Customer delete(int id) throws ShopNotFound;
	public List<Customer> findAll();
	public Customer update(Customer customer) throws ShopNotFound;
	public Customer findById(int id);

}
