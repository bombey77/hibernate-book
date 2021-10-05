package com.hibernate.motovilov.entity;

import javax.persistence.PrePersist;

public class AlertMonitor {

    @PrePersist
    public void newRoleAlert(User user) {
        System.out.println("Pre persist alert = " + user.getName());
    }
}