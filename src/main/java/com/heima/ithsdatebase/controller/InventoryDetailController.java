package com.heima.ithsdatebase.controller;

import com.heima.ithsdatebase.doamin.po.InventoryDetail;
import com.heima.ithsdatebase.service.InventoryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory-details")
public class InventoryDetailController {

    @Autowired
    private InventoryDetailService inventoryDetailService;

    @PostMapping
    public InventoryDetail addInventoryDetail(@RequestBody InventoryDetail detail) {
        return inventoryDetailService.addInventoryDetail(detail);
    }

    @PutMapping
    public InventoryDetail updateInventoryDetail(@RequestBody InventoryDetail detail) {
        return inventoryDetailService.updateInventoryDetail(detail);
    }

    @DeleteMapping("/{id}")
    public void deleteInventoryDetail(@PathVariable int id) {
        inventoryDetailService.deleteInventoryDetail(id);
    }

    @GetMapping("/{id}")
    public InventoryDetail findInventoryDetailById(@PathVariable int id) {
        return inventoryDetailService.findInventoryDetailById(id);
    }

    @GetMapping
    public List<InventoryDetail> findAllInventoryDetails() {
        return inventoryDetailService.findAllInventoryDetails();
    }

    @GetMapping("/inventory/{inventoryId}")
    public List<InventoryDetail> findByInventoryId(@PathVariable int inventoryId) {
        return inventoryDetailService.findByInventoryId(inventoryId);
    }

    @GetMapping("/product/{productId}")
    public List<InventoryDetail> findByProductId(@PathVariable int productId) {
        return inventoryDetailService.findByProductId(productId);
    }

}
