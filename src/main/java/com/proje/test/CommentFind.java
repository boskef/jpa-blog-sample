package com.proje.test;

import com.proje.model.Comment;
import com.proje.service.CommentService;
import com.proje.service.impl.CommentServiceImpl;

import java.util.List;

public class CommentFind {

    public static void main(String[] args) {
        CommentService commentService = new CommentServiceImpl();
        System.out.println("CommentCount: " + commentService.getCommentCount());

        Comment comment = commentService.getCommentById(1);
        System.out.println(comment);

        List<Comment> commentList = commentService.getComments();
        commentList.forEach(System.out::println);
    }
}
