package com.heima.ithsdatebase.service.impl;

import com.heima.ithsdatebase.dao.InventoryDetailDAO;
import com.heima.ithsdatebase.doamin.po.InventoryDetail;
import com.heima.ithsdatebase.service.InventoryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryDetailServiceImpl implements InventoryDetailService {
    @Autowired
    private InventoryDetailDAO inventoryDetailDAO;

    @Override
    public InventoryDetail addInventoryDetail(InventoryDetail detail) {
        return inventoryDetailDAO.save(detail);
    }

    @Override
    public InventoryDetail updateInventoryDetail(InventoryDetail detail) {
        return inventoryDetailDAO.save(detail);
    }

    @Override
    public void deleteInventoryDetail(int id) {
        inventoryDetailDAO.deleteById(id);
    }

    @Override
    public InventoryDetail findInventoryDetailById(int id) {
        return inventoryDetailDAO.findById(id).orElse(null);
    }

    @Override
    public List<InventoryDetail> findAllInventoryDetails() {
        return inventoryDetailDAO.findAll();
    }

    @Override
    public List<InventoryDetail> findByInventoryId(int inventoryId) {
        return inventoryDetailDAO.findByInventoryId(inventoryId);
    }

    @Override
    public List<InventoryDetail> findByProductId(int productId) {
        return inventoryDetailDAO.findByProductId(productId);
    }

}
