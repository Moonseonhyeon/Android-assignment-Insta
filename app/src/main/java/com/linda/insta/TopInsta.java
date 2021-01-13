package com.linda.insta;

public class TopInsta {
    private String username;
    private int imgResource;

    public TopInsta(String username, int imgResource) {
        this.username = username;
        this.imgResource = imgResource;
    }

    public String getUsername() {

        return username;
    }

    public int getImgResource() {

        return imgResource;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public void setImgResource(int imgResource) {

        this.imgResource = imgResource;
    }
}
