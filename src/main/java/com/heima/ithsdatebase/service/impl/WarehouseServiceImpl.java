package com.heima.ithsdatebase.service.impl;

import com.heima.ithsdatebase.dao.WarehouseDAO;
import com.heima.ithsdatebase.doamin.po.Warehouse;
import com.heima.ithsdatebase.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseDAO warehouseDAO;

    @Override
    public Warehouse addWarehouse(Warehouse warehouse) {
        return warehouseDAO.save(warehouse);
    }

    @Override
    public Warehouse updateWarehouse(Warehouse warehouse) {
        return warehouseDAO.save(warehouse);
    }

    @Override
    public void deleteWarehouse(int id) {
        warehouseDAO.deleteById(id);
    }

    @Override
    public Warehouse findWarehouseById(int id) {
        return warehouseDAO.findById(id).orElse(null);
    }

    @Override
    public List<Warehouse> findAllWarehouses() {
        return warehouseDAO.findAll();
    }
}
