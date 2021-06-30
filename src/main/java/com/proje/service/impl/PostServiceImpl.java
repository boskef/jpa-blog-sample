package com.proje.service.impl;

import com.proje.model.Post;
import com.proje.repository.PostRepository;
import com.proje.repository.impl.PostRepositoryImpl;
import com.proje.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {

    private PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }

    @Override
    public Post getPostById(int postId) {
        return postRepository.getPostById(postId);
    }

    @Override
    public List<Post> getPostByAuthorName(String authorName) {
        return postRepository.getPostByAuthorName(authorName);
    }

    @Override
    public Long getPostCount() {
        return postRepository.getPostCount();
    }

    @Override
    public List<Post> getPostByCategoryName(String categoryName) {
        return postRepository.getPostByCategoryName(categoryName);
    }

    @Override
    public boolean savePost(Post post) {
        return postRepository.savePost(post);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.updatePost(post);
    }

    @Override
    public boolean deletePost(Post post) {
        return postRepository.deletePost(post);
    }
}
