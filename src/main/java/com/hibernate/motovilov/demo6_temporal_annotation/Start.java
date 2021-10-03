package com.hibernate.motovilov.demo6_temporal_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Item;
import org.hibernate.Session;

import java.util.Date;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Item item = new Item();
        item.setCreateDate(new Date());
        item.setUpdateDate(new Date());
        item.setDeleteDate(new Date());
        item.setTimestamp(new Date());

        session.save(item);
        session.getTransaction().commit();
        session.close();
    }
}
