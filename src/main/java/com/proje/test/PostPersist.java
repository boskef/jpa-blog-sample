package com.proje.test;

import com.proje.model.Author;
import com.proje.model.Category;
import com.proje.model.Comment;
import com.proje.model.Post;
import com.proje.repository.PostRepository;
import com.proje.repository.impl.PostRepositoryImpl;
import com.proje.service.PostService;
import com.proje.service.impl.PostServiceImpl;

import java.util.Arrays;
import java.util.Date;

public class PostPersist {

    public static void main(String[] args) {

        PostService postService = new PostServiceImpl();

        Post post = new Post("postTitleField", "postContentField", new Date(), new Date());
        Category category = new Category("categoryNameField");
        Category category1 = new Category("categoryNameField1");

        Author author = new Author("authorNameField");
        Author author1 = new Author("authorName1Field");

        Comment comment = new Comment("commentField", new Date());
        Comment comment1 = new Comment("commentField1", new Date());

        post.setCategoryList(Arrays.asList(category, category1));
        post.setComment(Arrays.asList(comment, comment1));
        post.setAuthor(author);

        postService.savePost(post);
    }
}
