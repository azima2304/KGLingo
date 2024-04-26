package com.example.kyrgyzlanguage.models;

import com.example.kyrgyzlanguage.enums.Layer;

public class ModelTeacher {
    String img;
    String profile_img;
    String name;
    String status;
    String desc;
    double estimation;
    Layer layer;
    double duration;
    int price;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelTeacher(String img, String profile_img, String name, String desc, double estimation, Layer layer, double duration, int price) {
        this.img = img;
        this.profile_img = profile_img;
        this.name = name;
        this.desc = desc;
        this.estimation = estimation;
        this.layer = layer;
        this.duration = duration;
        this.price = price;
    }

    public ModelTeacher(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getEstimation() {
        return estimation;
    }

    public void setEstimation(double estimation) {
        this.estimation = estimation;
    }

    public Layer getLayer() {
        return layer;
    }

    public void setLayer(Layer layer) {
        this.layer = layer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
