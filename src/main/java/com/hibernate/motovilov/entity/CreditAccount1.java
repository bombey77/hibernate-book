package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
//@DiscriminatorValue("1")
public class CreditAccount1 extends Account1 {

    private BigDecimal creditLimit;

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
