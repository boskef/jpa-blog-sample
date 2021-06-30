package com.proje.service.impl;

import com.proje.model.Comment;
import com.proje.repository.CommentRepository;
import com.proje.repository.impl.CommentRepositoryImpl;
import com.proje.service.CategoryService;
import com.proje.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository = new CommentRepositoryImpl();

    @Override
    public List<Comment> getComments() {
        return commentRepository.getComments();
    }

    @Override
    public Comment getCommentById(int commentId) {
        return commentRepository.getCommentById(commentId);
    }

    @Override
    public Long getCommentCount() {
        return commentRepository.getCommentCount();
    }

    @Override
    public boolean saveComment(Comment comment) {
        return commentRepository.saveComment(comment);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.updateComment(comment);
    }

    @Override
    public boolean deleteComment(Comment comment) {
        return commentRepository.deleteComment(comment);
    }
}
