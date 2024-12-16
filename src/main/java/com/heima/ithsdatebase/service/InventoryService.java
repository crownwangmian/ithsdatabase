package com.heima.ithsdatebase.service;

import com.heima.ithsdatebase.doamin.dto.InventoryRequestDTO;
import com.heima.ithsdatebase.doamin.po.Inventory;

import java.util.List;

public interface InventoryService {

    Inventory createInventory(InventoryRequestDTO requestDTO);

    Inventory updateInventory(Inventory inventory);

    void deleteInventory(int id);

    Inventory findInventoryById(int id);

    List<Inventory> findAllInventories();

    List<Inventory> findByWarehouseId(int warehouseId);
}
