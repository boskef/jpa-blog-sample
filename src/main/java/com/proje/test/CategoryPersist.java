package com.proje.test;

import com.proje.model.Category;
import com.proje.service.CategoryService;
import com.proje.service.impl.CategoryServiceImpl;

public class CategoryPersist {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryServiceImpl();
        categoryService.saveCategory(new Category("categoryNameField"));
    }
}
