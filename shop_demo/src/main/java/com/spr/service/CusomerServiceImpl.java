package com.spr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spr.exception.ShopNotFound;
import com.spr.model.Customer;
import com.spr.repository.dao.ICustomerDao;
@Service
public class CusomerServiceImpl implements ICusomerService {

	@Resource
	private ICustomerDao customerDao;

	@Override
	public Customer create(Customer customer) {
		return customerDao.create(customer);
	}

	@Override
	public Customer delete(int id) throws ShopNotFound {
		return customerDao.delete(id);
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public Customer update(Customer customer) throws ShopNotFound {
		return customerDao.update(customer);
	}

	@Override
	public Customer findById(int id) {
		return customerDao.findById(id);
	}

}
