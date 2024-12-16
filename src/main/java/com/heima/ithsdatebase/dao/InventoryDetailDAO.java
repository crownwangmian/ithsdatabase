package com.heima.ithsdatebase.dao;

import com.heima.ithsdatebase.doamin.po.InventoryDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryDetailDAO extends JpaRepository<InventoryDetail, Integer> {
    List<InventoryDetail> findByInventoryId(int inventoryId); // 根据 inventoryId 查找

    List<InventoryDetail> findByProductId(int productId);     // 根据 productId 查找

}
