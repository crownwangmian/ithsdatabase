package com.heima.ithsdatebase.dao;

import com.heima.ithsdatebase.doamin.po.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryDAO extends JpaRepository<Inventory, Integer> {
    List<Inventory> findByWarehouseId(int warehouseId); // Spring Data JPA 自动解析此方法


}
