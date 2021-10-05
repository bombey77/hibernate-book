package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CurrencyId.class)
public class Currency {

    @Id
    private String currency;

    @Id
    private String sign;

    private long value;

    public Currency() {

    }

    public Currency(String currency, String sign, long value) {
        this.currency = currency;
        this.sign = sign;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}