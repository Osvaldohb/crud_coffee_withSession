package com.coffee.serviceproducts.service;

import com.coffee.serviceproducts.entity.Products;

import java.util.List;

public interface IProductService {

    public List<Products> findAll();

    public Products findById(Long id);

    public Products saveProduct(Products products);
}
