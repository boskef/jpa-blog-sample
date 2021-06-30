package com.proje.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Post.findPosts", query = "SELECT p FROM Post p"),
        @NamedQuery(name = "Post.findPostById", query = "SELECT p FROM Post p WHERE p.postId = :postId"),
        @NamedQuery(name = "Post.findPostByAuthorName", query = "SELECT p FROM Post p WHERE p.author.authorName = :authorName"),
        @NamedQuery(name = "Post.findPostCount", query = "SELECT COUNT(p) FROM Post p"),
        @NamedQuery(name = "Post.findPostByCategoryName", query = "SELECT p FROM Post p INNER JOIN p.categoryList c WHERE " +
                " c.categoryName = :categoryName")
})
@Table(name = "SS_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    @Column(name ="post_title")
    private String postTitle;

    @Column(name = "post_content")
    private String postContent;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "post_category_table", joinColumns = @JoinColumn(name = "post_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categoryList;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "post_comment_table", joinColumns =@JoinColumn(name = "post_id"),
    inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Comment> comment;

    public Post(){
    }

    public Post(String postTitle, String postContent, Date createdDate, Date updatedDate) {
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", categoryList=" + categoryList +
                ", author=" + author +
                ", comment=" + comment +
                '}';
    }
}
