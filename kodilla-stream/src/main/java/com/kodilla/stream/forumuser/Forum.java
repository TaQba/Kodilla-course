package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "John Rambo", 'M', LocalDate.of(1980, 4, 30), 5));
        theUserList.add(new ForumUser(2, "Mary Rambo", 'F', LocalDate.of(1981, 4, 29), 15));
        theUserList.add(new ForumUser(3, "Alan Rambo", 'M', LocalDate.of(2001, 4, 1), 105));
        theUserList.add(new ForumUser(4, "Fiona Rambo", 'F', LocalDate.of(2005, 4, 2), 25));
        theUserList.add(new ForumUser(5, "Oliva Rambo", 'F', LocalDate.of(2002, 4, 4), 75));
        theUserList.add(new ForumUser(6, "Barbara Rambo", 'F', LocalDate.of(1955, 4, 24), 0));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
