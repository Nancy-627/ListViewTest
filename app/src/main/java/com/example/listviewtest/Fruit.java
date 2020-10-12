package com.example.listviewtest;

public class Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    private int imageId;
    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
}
