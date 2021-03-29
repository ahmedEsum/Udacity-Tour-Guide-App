package com.example.tourguideapp;

public class AppDataModel {

    private int big_title;
    private int article;
    private int resID;


    public AppDataModel(int big_title, int article, int resID) {
        this.big_title = big_title;
        this.article = article;
        this.resID = resID;
    }

    public int getBig_title() {
        return big_title;
    }

    public int getArticle() {
        return article;
    }

    public int getResID() {
        return resID;
    }
}
