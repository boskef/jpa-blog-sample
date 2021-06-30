package com.proje.repository;

import com.proje.model.Comment;
import com.proje.model.Post;

import java.util.List;

public interface CommentRepository{
    List<Comment> getComments();
    Comment getCommentById(int commentId);
    Long getCommentCount();

    //save,update and delete transactions
    boolean saveComment(Comment comment);
    Comment updateComment(Comment comment);
    boolean deleteComment(Comment comment);
}
