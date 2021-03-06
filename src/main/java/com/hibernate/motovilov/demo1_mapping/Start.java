package com.hibernate.motovilov.demo1_mapping;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Email;
import com.hibernate.motovilov.entity.User;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("Roman");
        user.setEmail("someemail@gmail.com");
        session.save(user);

        // mapping with xml example
        Email email = new Email();
        email.setEmail("test@mail.com");
        session.persist(email);

        session.getTransaction().commit();
        session.close();


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("roman-hibernate");
//        EntityManager entityManager = emf.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        User user = new User();
//        user.setName("Roman");
//        user.setEmail("someemail@gmail.com");
//        entityManager.persist(user);
//
//        transaction.commit();
//        entityManager.close();
//        emf.close();
    }
}
