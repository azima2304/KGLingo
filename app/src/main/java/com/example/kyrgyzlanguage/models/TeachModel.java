package com.example.kyrgyzlanguage.models;

public class TeachModel {
    private String userName;
    private String status;
    private String language;
    private String level;
    private Double lessonDuration;
    private double price;
    private String imageUrl;
    private double rating;

    public TeachModel(String userName, String status, String language, String level, Double lessonDuration, double price, String imageUrl, double rating) {
        this.userName = userName;
        this.status = status;
        this.language = language;
        this.level = level;
        this.lessonDuration = lessonDuration;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
    }


    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public String  getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }

    public Double getLessonDuration() {
        return lessonDuration;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getRating() {
        return rating;
    }
}
