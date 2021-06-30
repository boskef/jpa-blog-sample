package com.proje.repository.impl;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Author;
import com.proje.repository.AuthorRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public List<Author> getAuthors() {
        TypedQuery<Author> authorTypedQuery = entityManager.createNamedQuery("Author.findAuthors",Author.class);
        return authorTypedQuery.getResultList();
    }

    @Override
    public Long getAuthorsCount() {
        TypedQuery<Long> typedQuery = entityManager.createNamedQuery("Author.findAuthorsCount",Long.class);
        return typedQuery.getSingleResult();
    }

    @Override
    public boolean saveAuthor(Author author) {
        try {
            entityTransaction.begin();
            entityManager.persist(author);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Author updateAuthor(Author author) {
        entityTransaction.begin();
        entityManager.merge(author);
        //refresh data updated on db.
        entityManager.flush();
        entityTransaction.commit();
        return author;
    }

    @Override
    public boolean deleteAuthor(Author author) {
        try {
            entityTransaction.begin();
            entityManager.remove(author);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
