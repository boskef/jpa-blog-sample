package com.proje.test;

import com.proje.model.Post;
import com.proje.repository.PostRepository;
import com.proje.repository.impl.PostRepositoryImpl;
import com.proje.service.PostService;
import com.proje.service.impl.PostServiceImpl;

import java.util.List;

public class PostFind {

    public static void main(String[] args) {
        PostService postService = new PostServiceImpl();
        List<Post> postList = postService.getPosts();
        postList.forEach(System.out::println);

        Post post = postService.getPostById(1);

        //displaying post details.
        System.out.println("Id:" + post.getPostId());
        System.out.println("PostTitle:" + post.getPostTitle());
        System.out.println("PostContent:" + post.getPostContent());
        System.out.println("PostComments:" + post.getComment().get(0).getComment());
        System.out.println("PostAuthor:" + post.getAuthor());

        //getting posts by postCategoryName
        List<Post> postList1 = postService.getPostByCategoryName("categoryNameField1");
        postList1.forEach(System.out::println);


        //getting posts by postAuthorName
        List<Post> postList2 = postService.getPostByAuthorName("authorNameField");
        postList2.forEach(System.out::println);
    }
}
