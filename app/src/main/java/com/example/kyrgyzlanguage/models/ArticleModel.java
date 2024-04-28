package com.example.kyrgyzlanguage.models;

public class ArticleModel {

    private int imageResourceId; // for the small image (image_card_model)
    private String title;
    private int starImageResourceId; // for the star image (image_star)
    private String description;

    public ArticleModel(int imageResourceId, String title, int starImageResourceId, String description) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.starImageResourceId = starImageResourceId;
        this.description = description;
    }

    // Getters and setters (optional)

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStarImageResourceId() {
        return starImageResourceId;
    }

    public void setStarImageResourceId(int starImageResourceId) {
        this.starImageResourceId = starImageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
