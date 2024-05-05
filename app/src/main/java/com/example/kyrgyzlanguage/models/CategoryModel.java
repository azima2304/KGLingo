package com.example.kyrgyzlanguage.models;

public class CategoryModel {
    int image;
    String name ;


    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public CategoryModel(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
