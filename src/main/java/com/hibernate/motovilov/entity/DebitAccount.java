package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends Account {

    private BigDecimal overdraftFe;

    public BigDecimal getOverdraftFe() {
        return overdraftFe;
    }

    public void setOverdraftFe(BigDecimal overdraftFe) {
        this.overdraftFe = overdraftFe;
    }
}
