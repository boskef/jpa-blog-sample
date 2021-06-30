package com.proje.queries;

public class PostQueries {
    public static final String FIND_POSTS = "SELECT p FROM Post p";
    public static final String FIND_POST_BY_ID = "SELECT p FROM Post p WHERE p.postId = :postId";
    public static final String FIND_POSTS_BY_AUTHOR_ID = "SELECT p FROM Post p LEFT JOIN p.author a WHERE a.authorId = :authorId";
    public static final String FIND_POSTS_BY_CATEGORY_ID = "SELECT p FROM Post p LEFT JOIN p.categoryList c WHERE c.categoryId = :categoryId";
}
