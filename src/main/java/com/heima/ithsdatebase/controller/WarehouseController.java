package com.heima.ithsdatebase.controller;

import com.heima.ithsdatebase.doamin.po.Warehouse;
import com.heima.ithsdatebase.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/warehouses")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @PostMapping
    public Warehouse addWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.addWarehouse(warehouse);
    }

    @PutMapping
    public Warehouse updateWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.updateWarehouse(warehouse);
    }

    @DeleteMapping("/{id}")
    public void deleteWarehouse(@PathVariable int id) {
        warehouseService.deleteWarehouse(id);
    }

    @GetMapping("/{id}")
    public Warehouse findWarehouseById(@PathVariable int id) {
        return warehouseService.findWarehouseById(id);
    }

    @GetMapping
    public List<Warehouse> findAllWarehouses() {
        return warehouseService.findAllWarehouses();
    }

}
