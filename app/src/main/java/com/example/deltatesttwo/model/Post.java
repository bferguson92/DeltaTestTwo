package com.example.deltatesttwo.model;

public class Post {

    int id;
    int userId;
    String body;
    String title;

    public Post(int id, int userId, String body, String title) {
        this.id = id;
        this.userId = userId;
        this.body = body;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }
}
