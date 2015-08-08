package com.spr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spr.exception.ShopNotFound;
import com.spr.model.Shop;
import com.spr.repository.dao.IShopDao;

@Service
public class ShopServiceImpl implements IShopService {

	@Resource
	private IShopDao shopDao;

	@Override
	public Shop create(Shop shop) {
		return shopDao.create(shop);
	}

	@Override
	public Shop findById(int id) {
		return shopDao.findById(id);
	}

	@Override
	public Shop delete(int id) throws ShopNotFound {
		return shopDao.delete(id);
	}

	@Override
	public List<Shop> findAll() {
		return shopDao.findAll();
	}

	@Override
	public Shop update(Shop shop) throws ShopNotFound {
		return shopDao.update(shop);
	}

}
