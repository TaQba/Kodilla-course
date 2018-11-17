package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String nickname;
    private final char sex;
    private final LocalDate dob;
    private final int numberOfPosts;

    public ForumUser(final int id, final String nickname, final char sex, final LocalDate dob, final int numberOfPosts) {
        this.id = id;
        this.nickname = nickname;
        this.sex = sex;
        this.dob = dob;
        this.numberOfPosts = numberOfPosts;
    }

    public String getNickname() {
        return nickname;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getYob() {
        return  dob.getYear();
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", dob=" + dob.toString() +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
