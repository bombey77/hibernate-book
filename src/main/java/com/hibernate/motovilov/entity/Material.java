package com.hibernate.motovilov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(insertable = true, // insert null if false
            updatable = true, // update null if false
            name = "TYPE_NAME", // The name of the column. Defaults to the property or field name
            nullable = false, // Whether the database column is nullable
            length = 20, // The column length. (Applies only if a string-valued column is used.)
            precision = 0, // The precision for a decimal (exact numeric) column. (Applies only if a decimal column is used.) Value must be set by developer if used when generating the DDL for the column.
            scale = 0, // The scale for a decimal (exact numeric) column. (Applies only if a decimal column is used.
            unique = true) // Whether the column is a unique key
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
