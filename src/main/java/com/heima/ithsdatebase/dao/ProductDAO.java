package com.heima.ithsdatebase.dao;

import com.heima.ithsdatebase.doamin.po.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {
}
