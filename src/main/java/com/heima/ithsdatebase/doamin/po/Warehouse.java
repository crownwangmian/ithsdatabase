package com.heima.ithsdatebase.doamin.po;

import jakarta.persistence.*;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "warehouse_name")
    private String warehouseName;
    private String region;


    public Warehouse() {
    }

    public Warehouse(int id, String warehouseName, String region) {
        this.id = id;
        this.warehouseName = warehouseName;
        this.region = region;
    }

    // Getters 和 Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
