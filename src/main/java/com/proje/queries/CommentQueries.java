package com.proje.queries;

public class CommentQueries {
    public static final String FIND_COMMENTS = "SELECT c FROM Comment c";
    public static final String FIND_COMMENT_BY_ID = "SELECT c FROM Comment c WHERE c.commentId = :commentId";
}
