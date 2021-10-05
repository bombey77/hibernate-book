package com.hibernate.motovilov.entity;

import java.io.Serializable;

// class should implements Serializable and
// should have fields with the same names as entity class
public class CurrencyId implements Serializable {

    private String currency;

    private String sign;

    public CurrencyId() {

    }

    public CurrencyId(String currency, String sign) {
        this.currency = currency;
        this.sign = sign;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSign() {
        return sign;
    }
}
