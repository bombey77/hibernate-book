package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount2 extends Account2 {

    private BigDecimal overdraftFe;

    public BigDecimal getOverdraftFe() {
        return overdraftFe;
    }

    public void setOverdraftFe(BigDecimal overdraftFe) {
        this.overdraftFe = overdraftFe;
    }
}
