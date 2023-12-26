package com.example.demo.persistence.crud;

import com.example.demo.domain.model.Product;
import com.example.demo.persistence.entity.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProductJpaRepository extends JpaRepository<ProductData, Integer> {



}
