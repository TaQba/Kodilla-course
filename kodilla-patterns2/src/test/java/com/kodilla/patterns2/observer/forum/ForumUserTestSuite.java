package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;


public class ForumUserTestSuite<johnSmith> {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");

        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);

        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("posth1");
        javaHelpForum.addPost("posth2");
        javaHelpForum.addPost("posth3");
        javaToolsForum.addPost("postt1");
        javaToolsForum.addPost("postt2");

        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, ivoneEscobar.getUpdateCount());
        Assert.assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
