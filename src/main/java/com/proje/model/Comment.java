package com.proje.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Comment.findComments", query = "SELECT c FROM Comment c"),
        @NamedQuery(name = "Comment.findCommentById", query = "SELECT c FROM Comment c WHERE c.commentId = :commentId"),
        @NamedQuery(name = "Comment.findCommentCount", query = "SELECT COUNT(c) FROM Comment c")
})
@Table(name = "SS_COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    private String comment;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    public Comment(){ }

    public Comment(String comment, Date createdDate) {
        this.comment = comment;
        this.createdDate = createdDate;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", comment='" + comment + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
