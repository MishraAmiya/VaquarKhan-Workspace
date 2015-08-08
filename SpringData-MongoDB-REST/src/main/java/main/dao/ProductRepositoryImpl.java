package main.dao;

import main.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;


public class ProductRepositoryImpl implements ProductRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Product> findBySkuOnlyAvailablesCustom(String sku) {
        Criteria criteria = Criteria.where("sku").is(sku).andOperator(Criteria.where("availability").is(1));
        return mongoTemplate.find(Query.query(criteria), Product.class);
    }
}
