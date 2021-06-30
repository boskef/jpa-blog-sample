package com.proje.service;

import com.proje.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategoryAll();
    Category getCategoryById(int categoryId);
    Long getCategoryCount();

    //save,update and delete transactions
    boolean saveCategory(Category category);
    Category updateCategory(Category category);
    boolean deleteCategory(Category category);
}
