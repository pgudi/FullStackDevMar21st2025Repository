package com.gentech.relationship.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_videoposts")
public class VideoPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Integer id;
    @Column(name = "video_type")
    private String videoType;
    @Column(name = "video_description")
    private String videoDescription;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "video_comment_id", referencedColumnName = "video_id")
    private List<Comments> comments=new ArrayList<>();

    public VideoPost(){

    }

    public VideoPost(Integer id, String videoType, String videoDescription, List<Comments> comments) {
        this.id = id;
        this.videoType = videoType;
        this.videoDescription = videoDescription;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
