package com.proje.queries;

public class CategoryQueries {
    public static final String FIND_CATEGORIES = "SELECT c FROM Category c";
    public static final String FIND_CATEGORY_BY_ID = "SELECT c FROM Category c WHERE c.categoryId = :categoryId";

}
