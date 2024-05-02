package com.example.kyrgyzlanguage.models;
// PodcastModel.java

public class PodcastModel {
    private String title;
    private String description;
    private String image;

    public String getImage() {
        return image;
    }

    public PodcastModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
