package com.proje.test;

import com.proje.model.Comment;
import com.proje.service.CommentService;
import com.proje.service.impl.CommentServiceImpl;

import java.util.Date;

public class CommentPersist {

    public static void main(String[] args) {
        CommentService commentService = new CommentServiceImpl();
        Comment comment = new Comment("firstCommentPersist", new Date());
        commentService.saveComment(comment);
    }
}
