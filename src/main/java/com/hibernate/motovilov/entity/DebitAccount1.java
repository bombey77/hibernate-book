package com.hibernate.motovilov.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
//@DiscriminatorValue("2")
public class DebitAccount1 extends Account1 {

    private BigDecimal overdraftFe;

    public BigDecimal getOverdraftFe() {
        return overdraftFe;
    }

    public void setOverdraftFe(BigDecimal overdraftFe) {
        this.overdraftFe = overdraftFe;
    }
}
