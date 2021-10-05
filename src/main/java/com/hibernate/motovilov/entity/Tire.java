package com.hibernate.motovilov.entity;

import javax.persistence.Embeddable;

// При встраивании в какой либо класс Entity поля из встравиваемого класса
// будут созданы как колонки, а не отдельная таблица.
@Embeddable
public class Tire {

    private String type;
    private String material;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
