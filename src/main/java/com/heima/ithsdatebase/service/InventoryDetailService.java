package com.heima.ithsdatebase.service;

import com.heima.ithsdatebase.doamin.po.InventoryDetail;

import java.util.List;

public interface InventoryDetailService {

    InventoryDetail addInventoryDetail(InventoryDetail detail);

    InventoryDetail updateInventoryDetail(InventoryDetail detail);

    void deleteInventoryDetail(int id);

    InventoryDetail findInventoryDetailById(int id);

    List<InventoryDetail> findAllInventoryDetails();

    List<InventoryDetail> findByInventoryId(int inventoryId);

    List<InventoryDetail> findByProductId(int productId);
}
