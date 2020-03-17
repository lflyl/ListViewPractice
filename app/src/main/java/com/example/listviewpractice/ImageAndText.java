package com.example.listviewpractice;

public class ImageAndText {
    private String text;
    private int imageId;

    public ImageAndText(String name, int imageId) {
        this.text = name;
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public int getImageId() {
        return imageId;
    }
}
