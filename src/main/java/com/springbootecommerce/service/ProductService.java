package com.springbootecommerce.service;

import com.springbootecommerce.entity.Category;
import com.springbootecommerce.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();
    void  addProduct(Product product);

    void removeProductById(long id);

    Optional<Product> getProductById(long id);

    List<Product> getAllProductsByCategoryId(int id);

}
