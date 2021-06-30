package com.dio.productcatalog.controller;

import com.dio.productcatalog.model.Product;
import com.dio.productcatalog.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product){
        return new ResponseEntity<Product>(repository.save(product), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> find(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok().body(repository.findById(id).orElseThrow(() -> new Exception("Item não encontrado!")));
    }

    
}