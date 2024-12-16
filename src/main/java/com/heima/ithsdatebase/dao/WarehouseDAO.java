package com.heima.ithsdatebase.dao;

import com.heima.ithsdatebase.doamin.po.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseDAO extends JpaRepository<Warehouse, Integer> {
}
