package com.proje.queries;

public class AuthorQueries {
    public static final String FIND_AUTHORS = "SELECT a FROM Author a";
    public static final String FIND_AUTHOR_BY_ID = "SELECT a FROM Author a WHERE a.authorId = :authorId";
}
