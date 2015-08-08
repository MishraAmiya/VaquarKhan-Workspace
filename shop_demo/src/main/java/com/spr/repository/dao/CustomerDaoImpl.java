package com.spr.repository.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spr.exception.ShopNotFound;
import com.spr.model.Customer;
import com.spr.repository.CustomerRepository;
@Repository

public class CustomerDaoImpl implements ICustomerDao{

	@Resource
	private CustomerRepository customerRepository;

	@Override
	@Transactional
	public Customer create(Customer customer) {
		Customer createdShop = customer;
		return customerRepository.save(createdShop);
	}
	
	@Override
	@Transactional
	public Customer findById(int id) {
		return customerRepository.findOne((long) id);
	}

	@Override
	@Transactional(rollbackFor=ShopNotFound.class)
	public Customer delete(int id) throws ShopNotFound {
		Customer deletedCustomer = customerRepository.findOne((long) id);
		
		if (deletedCustomer == null)
			throw new ShopNotFound();
		
		customerRepository.delete(deletedCustomer);
		return deletedCustomer;
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor=ShopNotFound.class)
	public Customer update(Customer customer) throws ShopNotFound {
		Customer updatedCustomer = customerRepository.findOne(customer.getId());
		
		if (updatedCustomer == null)
			throw new ShopNotFound();
		
		updatedCustomer.setName(customer.getName());
		updatedCustomer.setEmail(customer.getEmail());
		return updatedCustomer;
	}

	
}
