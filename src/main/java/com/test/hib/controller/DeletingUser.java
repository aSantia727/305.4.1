

package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User; // Corrected import

public class DeletingUser {
    public static void main(String[] args) {
        SessionFactory factory = null;
        Session session = null;
        Transaction tx = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
            tx = session.beginTransaction();

            User u = new User();
            u.setId(3);
            session.remove(u);

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