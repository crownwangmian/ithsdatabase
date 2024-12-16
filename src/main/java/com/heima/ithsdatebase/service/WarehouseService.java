package com.heima.ithsdatebase.service;

import com.heima.ithsdatebase.doamin.po.Warehouse;

import java.util.List;

public interface WarehouseService {
    Warehouse addWarehouse(Warehouse warehouse);

    Warehouse updateWarehouse(Warehouse warehouse);

    void deleteWarehouse(int id);

    Warehouse findWarehouseById(int id);

    List<Warehouse> findAllWarehouses();
}
