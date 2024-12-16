package com.heima.ithsdatebase.doamin.po;

import jakarta.persistence.*;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int warehouseId;
    @Column(name = "total_value")
    private double totalValue;


    public Inventory() {}

    public Inventory(int id, int warehouseId, double totalValue) {
        this.id = id;
        this.warehouseId = warehouseId;
        this.totalValue = totalValue;
    }

    // Getters 和 Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
