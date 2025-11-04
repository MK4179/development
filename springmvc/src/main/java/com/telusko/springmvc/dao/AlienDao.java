package com.telusko.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;


import com.telusko.springmvc.model.Alien;

@Repository
public class AlienDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAliens() {
        
        Session session = sessionFactory.getCurrentSession();

        List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();

        return aliens;
    }

    @Transactional
    public void addAlien(Alien alien) {
        System.out.println(">>> addAlien called for: " + alien);

        // TODO Auto-generated method stub
       Session session = sessionFactory.getCurrentSession();
        session.save(alien);
        
        //throw new UnsupportedOperationException("Unimplemented method 'addAlien'");
    
    }

    @Transactional
    public Alien getAlien(int id) {
        
        Session session = sessionFactory.getCurrentSession();

        Alien aliens = session.get(Alien.class, id);


        return aliens;
    }
}
