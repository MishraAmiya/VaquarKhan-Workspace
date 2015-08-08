package main.dao;

import main.model.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    public List<Product> findBySkuOnlyAvailablesCustom(String sku);
}
