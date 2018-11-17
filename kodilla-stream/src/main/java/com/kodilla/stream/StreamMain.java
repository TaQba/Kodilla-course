package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;
import java.time.Year;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        int yearMinus20 = Year.now().getValue() - 20;

        Map< Integer, ForumUser> theResultMapOfForum  = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'F')
                .filter(user -> user.getYob() > yearMinus20)
                .filter(user -> user.getNumberOfPosts() > 0)

                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("# elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}