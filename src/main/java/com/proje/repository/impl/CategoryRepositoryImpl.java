package com.proje.repository.impl;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Category;
import com.proje.repository.CategoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public List<Category> getCategoryAll() {
        TypedQuery<Category> categoryTypedQuery = entityManager.createNamedQuery("Category.findCategories",Category.class);
        return categoryTypedQuery.getResultList();
    }

    @Override
    public Category getCategoryById(int categoryId) {
        TypedQuery<Category> categoryTypedQuery = entityManager.createNamedQuery("Category.findCategoryById",Category.class);
        categoryTypedQuery.setParameter("categoryId",categoryId);
        return categoryTypedQuery.getSingleResult();
    }

    @Override
    public Long getCategoryCount() {
        TypedQuery<Long> typedQuery = entityManager.createNamedQuery("Category.findCategoryCount",Long.class);
        return typedQuery.getSingleResult();
    }

    @Override
    public boolean saveCategory(Category category) {
        try {
            entityTransaction.begin();
            entityManager.persist(category);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Category updateCategory(Category category) {
        entityTransaction.begin();
        entityManager.merge(category);
        //refresh data update on db.
        entityManager.flush();
        entityTransaction.commit();

        return category;
    }

    @Override
    public boolean deleteCategory(Category category) {
        try {
            entityTransaction.begin();
            entityManager.remove(category);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
