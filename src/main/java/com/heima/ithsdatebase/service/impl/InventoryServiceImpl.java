package com.heima.ithsdatebase.service.impl;

import com.heima.ithsdatebase.dao.InventoryDAO;
import com.heima.ithsdatebase.dao.InventoryDetailDAO;
import com.heima.ithsdatebase.dao.ProductDAO;
import com.heima.ithsdatebase.doamin.dto.InventoryRequestDTO;
import com.heima.ithsdatebase.doamin.po.Inventory;
import com.heima.ithsdatebase.doamin.po.InventoryDetail;
import com.heima.ithsdatebase.doamin.po.Product;
import com.heima.ithsdatebase.service.InventoryService;
import com.heima.ithsdatebase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryDAO inventoryDAO;
    @Autowired
    private InventoryDetailDAO inventoryDetailDAO;

    @Autowired
    private ProductDAO productDAO;

    @Override
    public Inventory createInventory(InventoryRequestDTO requestDTO) {

        Inventory inventory = new Inventory();
        inventory.setWarehouseId(requestDTO.getWarehouseId());
        inventory.setTotalValue(0.0);
        Inventory savedInventory = inventoryDAO.save(inventory);


        double totalValue = 0.0;
        for (InventoryRequestDTO.ProductDetail productDetail : requestDTO.getProductDetails()) {

            Product product = productDAO.findById(productDetail.getProductId())
                    .orElseThrow(() -> new RuntimeException("Product not found"));


            double productTotalValue = product.getPrice() * productDetail.getQuantity();
            totalValue += productTotalValue;


            InventoryDetail inventoryDetail = new InventoryDetail();
            inventoryDetail.setInventoryId(savedInventory.getId());
            inventoryDetail.setProductId(product.getId());
            inventoryDetail.setQuantity(productDetail.getQuantity());

            inventoryDetailDAO.save(inventoryDetail);
        }

        // 3. 更新 Inventory 的 totalValue 并保存
        savedInventory.setTotalValue(totalValue);
        return inventoryDAO.save(savedInventory);
    }

    @Override
    public Inventory updateInventory(Inventory inventory) {
        return inventoryDAO.save(inventory);
    }

    @Override
    public void deleteInventory(int id) {
        inventoryDAO.deleteById(id);
    }

    @Override
    public Inventory findInventoryById(int id) {
        return inventoryDAO.findById(id).orElse(null);
    }

    @Override
    public List<Inventory> findAllInventories() {
        return inventoryDAO.findAll();
    }

    @Override
    public List<Inventory> findByWarehouseId(int warehouseId) {
        return inventoryDAO.findByWarehouseId(warehouseId);
    }

}
