package com.proje.service.impl;

import com.proje.model.Category;
import com.proje.repository.CategoryRepository;
import com.proje.repository.impl.CategoryRepositoryImpl;
import com.proje.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    public List<Category> getCategoryAll() {
        return categoryRepository.getCategoryAll();
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return categoryRepository.getCategoryById(categoryId);
    }

    @Override
    public Long getCategoryCount() {
        return categoryRepository.getCategoryCount();
    }

    @Override
    public boolean saveCategory(Category category) {
        return categoryRepository.saveCategory(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.updateCategory(category);
    }

    @Override
    public boolean deleteCategory(Category category) {
        return categoryRepository.deleteCategory(category);
    }
}
