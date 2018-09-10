package com.edwardhollingsworth.msa.josephus.service;

public class Greeting {

    private final String content;

    public Greeting() {
        this.content = null;
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
