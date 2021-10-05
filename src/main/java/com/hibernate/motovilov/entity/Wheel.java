package com.hibernate.motovilov.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wheel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private Integer calibre;

    // Если класс с аннотацией @Embeddable встраивается в другой класс,
    // то над этим полем можно установить аннотацию @Embedded (не обязательно)
    @Embedded
    private Tire tire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCalibre() {
        return calibre;
    }

    public void setCalibre(Integer calibre) {
        this.calibre = calibre;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
