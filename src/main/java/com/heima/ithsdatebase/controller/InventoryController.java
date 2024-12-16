package com.heima.ithsdatebase.controller;

import com.heima.ithsdatebase.doamin.dto.InventoryRequestDTO;
import com.heima.ithsdatebase.doamin.po.Inventory;
import com.heima.ithsdatebase.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public Inventory createInventory(@RequestBody InventoryRequestDTO requestDTO) {
        return inventoryService.createInventory(requestDTO);
    }


    @PutMapping
    public Inventory updateInventory(@RequestBody Inventory inventory) {
        return inventoryService.updateInventory(inventory);
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable int id) {
        inventoryService.deleteInventory(id);
    }

    @GetMapping("/{id}")
    public Inventory findInventoryById(@PathVariable int id) {
        return inventoryService.findInventoryById(id);
    }

    @GetMapping
    public List<Inventory> findAllInventories() {
        return inventoryService.findAllInventories();
    }

    @GetMapping("/warehouse/{warehouseId}")
    public List<Inventory> findByWarehouseId(@PathVariable int warehouseId) {
        return inventoryService.findByWarehouseId(warehouseId);
    }


}
