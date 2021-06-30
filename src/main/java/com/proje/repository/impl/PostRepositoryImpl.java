package com.proje.repository.impl;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Post;
import com.proje.repository.PostRepository;

import javax.persistence.*;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public List<Post> getPosts() {
        TypedQuery<Post> typedQuery = entityManager.createNamedQuery("Post.findPosts", Post.class);
        List<Post> postList = typedQuery.getResultList();
        return postList;
    }

    @Override
    public Post getPostById(int postId) {
        TypedQuery<Post> typedQuery = entityManager.createNamedQuery("Post.findPostById", Post.class);
        typedQuery.setParameter("postId",postId);
        Post post = typedQuery.getSingleResult();
        return post;
    }

    @Override
    public List<Post> getPostByAuthorName(String authorName) {
        TypedQuery<Post> typedQuery = entityManager.createNamedQuery("Post.findPostByAuthorName", Post.class);
        typedQuery.setParameter("authorName", authorName);
        List<Post> postList = typedQuery.getResultList();
        return postList;
    }

    @Override
    public Long getPostCount() {
        TypedQuery<Long> typedQuery = entityManager.createNamedQuery("Post.findPostCount", Long.class);
        Long postCount = typedQuery.getSingleResult();
        return postCount;
    }

    @Override
    public List<Post> getPostByCategoryName(String categoryName) {
        TypedQuery<Post> typedQuery = entityManager.createNamedQuery("Post.findPostByCategoryName", Post.class);
        typedQuery.setParameter("categoryName", categoryName);
        List<Post> postList = typedQuery.getResultList();
        return postList;
    }

    @Override
    public boolean savePost(Post post) {
        try {
            this.entityTransaction.begin();
            this.entityManager.persist(post);
            this.entityTransaction.commit();
        }catch(RuntimeException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Post updatePost(Post post) {
        entityTransaction.begin();
        entityManager.merge(post);
        entityTransaction.commit();

        return post;
    }

    @Override
    public boolean deletePost(Post post) {
        try {
            entityTransaction.begin();
            entityManager.remove(post);
            entityTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
