package com.coffee.serviceproducts.controllers;

import com.coffee.serviceproducts.entity.Products;
import com.coffee.serviceproducts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Controller
@RestController
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("listar")
    public List<Products> listar(){
        return iProductService.findAll();
    }

    @GetMapping("/product/{id}")
    public Products OneItem(@PathVariable Long id){
        Products product=iProductService.findById(id);
        return product;
    }

    @PostMapping("/add")
    public HttpStatus create(@RequestBody Products products){
        Products savep=iProductService.saveProduct(products);
        return HttpStatus.CREATED;
    }

}
