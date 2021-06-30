package com.proje.test;

import com.proje.model.Category;
import com.proje.model.Post;
import com.proje.service.CategoryService;
import com.proje.service.impl.CategoryServiceImpl;

import java.util.List;

public class CategoryFind {
    public static void main(String[] args) {

        CategoryService categoryService = new CategoryServiceImpl();
        Category category = categoryService.getCategoryById(2);

        if(category != null) {
            System.out.println("CategoryId:" + category.getCategoryId());
            System.out.println("CategoryName:" + category.getCategoryName());

            List<Post> postList = category.getPostList();
            postList.forEach(System.out::println);
        }
    }
}
