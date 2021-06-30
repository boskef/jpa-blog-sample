package com.proje.repository;

import com.proje.model.Category;
import com.proje.model.Post;

import java.util.List;

public interface CategoryRepository{
    List<Category> getCategoryAll();
    Category getCategoryById(int categoryId);
    Long getCategoryCount();

    //save,update and delete transactions
    boolean saveCategory(Category category);
    Category updateCategory(Category category);
    boolean deleteCategory(Category category);
}
