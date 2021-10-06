package com.hibernate.motovilov.demo13_one_to_one;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Role4;
import com.hibernate.motovilov.entity.User4;
import org.hibernate.Session;

import java.util.Arrays;

// Bidirectional
public class Start4 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Role4 adminRole = new Role4();
        adminRole.setRoleName("admin");

        Role4 userRole = new Role4();
        userRole.setRoleName("user");

        User4 user = new User4();
        user.setUserName("roman");
        user.setRole(Arrays.asList(adminRole, userRole));

        adminRole.setUser(user);
        userRole.setUser(user);

        session.save(user);
        session.save(adminRole);
        session.save(userRole);

        session.getTransaction().commit();
        session.close();
    }
}
