package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShares = steven.sharePost();
        System.out.println("Steven: " + stevenShares);
        String johnShares = john.sharePost();
        System.out.println("John: " + johnShares);
        String kodillaShares = kodilla.sharePost();
        System.out.println("Kodilla: " + kodillaShares);

        //Then
        Assert.assertEquals("Shared in FB", stevenShares);
        Assert.assertEquals("Shared in Twitter", johnShares);
        Assert.assertEquals("Shared in Snapchat", kodillaShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        steven.setPublisher(new TwitterPublisher());
        String stevenShares = steven.sharePost();
        System.out.println("Steven: " + stevenShares);

        //Then
        Assert.assertEquals("Shared in Twitter", stevenShares);
    }
}
