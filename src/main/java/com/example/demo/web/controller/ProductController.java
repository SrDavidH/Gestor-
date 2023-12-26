package com.example.demo.web.controller;

import com.example.demo.domain.model.Product;
import com.example.demo.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }
}
