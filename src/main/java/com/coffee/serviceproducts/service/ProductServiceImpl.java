package com.coffee.serviceproducts.service;

import com.coffee.serviceproducts.dao.ProductDao;
import com.coffee.serviceproducts.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Products> findAll() {
        return (List<Products>) productDao.findAll();
    }

    @Override
    public Products findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public Products saveProduct(Products products) {
        return productDao.save(products);
    }
}
