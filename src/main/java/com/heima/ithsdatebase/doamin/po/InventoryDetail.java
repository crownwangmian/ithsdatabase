package com.heima.ithsdatebase.doamin.po;

import jakarta.persistence.*;

@Entity
public class InventoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "inventory_id")
    private int inventoryId;
    @Column(name = "product_id")
    private int productId;
    private int quantity;


    public InventoryDetail() {
    }

    public InventoryDetail(int id, int inventoryId, int productId, int quantity) {
        this.id = id;
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters 和 Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
