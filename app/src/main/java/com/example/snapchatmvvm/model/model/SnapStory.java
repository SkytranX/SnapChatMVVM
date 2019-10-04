package com.example.snapchatmvvm.model.model;

public class SnapStory {

    private String userName;
    private String imageUrl;

    public SnapStory(String userName, String imageUrl) {
        this.userName = userName;
        this.imageUrl = imageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
