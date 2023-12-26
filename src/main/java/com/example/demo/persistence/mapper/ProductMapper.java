package com.example.demo.persistence.mapper;

import com.example.demo.domain.model.Product;
import com.example.demo.persistence.entity.ProductData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductData toProductData(Product product);
    Product toProduct(ProductData productData);

    List<Product> toProductsList(List<ProductData> productDataList);
}
