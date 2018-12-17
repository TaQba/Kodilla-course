package com.kodilla.patterns.strategy.social;

public class User {
    final String name;
    SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
