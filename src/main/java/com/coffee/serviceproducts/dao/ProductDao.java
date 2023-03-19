package com.coffee.serviceproducts.dao;

import com.coffee.serviceproducts.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Long> {

}
