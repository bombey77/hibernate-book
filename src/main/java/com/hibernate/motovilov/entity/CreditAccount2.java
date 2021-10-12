package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount2 extends Account2 {

    private BigDecimal creditLimit;

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
