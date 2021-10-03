package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IceCream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // creates column with name size and varchar type
    // in case ORDINAL -> creates int type column
    @Enumerated(EnumType.STRING)
    private Size size;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

