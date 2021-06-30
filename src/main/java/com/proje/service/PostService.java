package com.proje.service;

import com.proje.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
    Post getPostById(int postId);
    List<Post> getPostByAuthorName(String authorName);
    Long getPostCount();
    List<Post> getPostByCategoryName(String categoryName);

    //save,update and delete transactions
    boolean savePost(Post post);
    Post updatePost(Post post);
    boolean deletePost(Post post);
}
