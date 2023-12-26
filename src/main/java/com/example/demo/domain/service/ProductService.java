package com.example.demo.domain.service;

import com.example.demo.domain.model.Product;
import com.example.demo.persistence.crud.ProductJpaRepository;
import com.example.demo.persistence.entity.ProductData;
import com.example.demo.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper mapper;
    @Autowired
    private ProductJpaRepository productJpaRepository;
    public List<Product> findAll(){
        List<ProductData> productDataList = productJpaRepository.findAll();
       List<Product> productList = mapper.toProductsList(productDataList);
       return productList;
    }

    public Product save(Product product){
        ProductData productData = mapper.toProductData(product);
        Product saveProduct = mapper.toProduct(productJpaRepository.save(productData));
        return saveProduct;
    }
}
