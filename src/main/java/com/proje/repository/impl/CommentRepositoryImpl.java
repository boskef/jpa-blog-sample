package com.proje.repository.impl;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Comment;
import com.proje.repository.CommentRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public List<Comment> getComments() {
        TypedQuery<Comment> commentTypedQuery = entityManager.createNamedQuery("Comment.findComments",Comment.class);
        return commentTypedQuery.getResultList();
    }

    @Override
    public Comment getCommentById(int commentId) {
        TypedQuery<Comment> commentTypedQuery = entityManager.createNamedQuery("Comment.findCommentById",Comment.class);
        commentTypedQuery.setParameter("commentId",commentId);
        return commentTypedQuery.getSingleResult();
    }

    @Override
    public Long getCommentCount() {
        TypedQuery<Long> commentTypedQuery = entityManager.createNamedQuery("Comment.findCommentCount",Long.class);
        return commentTypedQuery.getSingleResult();
    }

    @Override
    public boolean saveComment(Comment comment) {
        try {
            entityTransaction.begin();
            entityManager.persist(comment);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Comment updateComment(Comment comment) {
        entityTransaction.begin();
        entityManager.merge(comment);
        entityTransaction.commit();
        return comment;
    }

    @Override
    public boolean deleteComment(Comment comment) {
        try {
            entityTransaction.begin();
            entityManager.remove(comment);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
