package com.farhanrasyad.laundryapp.model;

public class Search {

    private int image;
    private String name;
    private String score;
    private String location;

    public Search(int image, String name, String score, String location) {
        this.image = image;
        this.name = name;
        this.score = score;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
