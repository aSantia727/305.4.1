

package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User; // Corrected import

public class FindingUser {
    public static void main(String[] args) {
        SessionFactory factory = null;
        Session session = null;
        Transaction tx = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
            tx = session.beginTransaction();

            int USER_ID = 2;
            User u = session.load(User.class, USER_ID);
            System.out.println("Fullname: " + u.getFullname());
            System.out.println("Email: " + u.getEmail());
            System.out.println("password: " + u.getPassword());

            tx.commit();
        } finally {
            if (session != null) {
                session.close();
            }
            if (factory != null) {
                factory.close();
            }
        }
    }
}