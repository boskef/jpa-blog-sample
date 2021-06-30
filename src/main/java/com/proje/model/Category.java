package com.proje.model;

import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Category.findCategories", query = "SELECT c FROM Category c"),
        @NamedQuery(name = "Category.findCategoryById", query = "SELECT c FROM Category c WHERE c.categoryId = :categoryId"),
        @NamedQuery(name = "Category.findCategoryCount", query = "SELECT COUNT(c) FROM Category c")
})
@Table(name = "SS_CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;


    @ManyToMany(mappedBy = "categoryList")
    private List<Post> postList;

    public Category(){
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
