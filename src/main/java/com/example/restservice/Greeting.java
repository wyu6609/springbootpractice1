package com.example.restservice;

public class Greeting {

    private final long id;
    private final String content;
    //create constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    //create getter for both fields

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }




}
