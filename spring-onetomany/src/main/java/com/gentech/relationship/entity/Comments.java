package com.gentech.relationship.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer id;
    @Column(name = "comment_type")
    private String commentType;
    @Column(name = "comment_description")
    private String commentDescription;

    public Comments(){

    }

    public Comments(Integer id, String commentType, String commentDescription) {
        this.id = id;
        this.commentType = commentType;
        this.commentDescription = commentDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }
}
