package com.heima.ithsdatebase.service;

import com.heima.ithsdatebase.doamin.po.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(int id);

    Product findProductById(int id);

    List<Product> findAllProducts();
}
