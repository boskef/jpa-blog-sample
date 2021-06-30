package com.proje.jpaFactory.impl;

import com.proje.jpaFactory.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements JpaFactory {
    private EntityManager entityManager = null;
    @Override
    public EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit-mysql");
        this.entityManager =  entityManagerFactory.createEntityManager();
        return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {
        return this.entityManager.getTransaction();
    }
}
