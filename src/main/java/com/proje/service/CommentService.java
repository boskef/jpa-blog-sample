package com.proje.service;

import com.proje.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getComments();
    Comment getCommentById(int commentId);
    Long getCommentCount();

    //save,update and delete transactions
    boolean saveComment(Comment comment);
    Comment updateComment(Comment comment);
    boolean deleteComment(Comment comment);
}
