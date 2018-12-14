package com.example.aseel.myfinalapp;

public class Player {
    private String name;
    private String pos;
    private int image;

    public Player(String name, String pos, int image) {
        this.name = name;
        this.pos = pos;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
