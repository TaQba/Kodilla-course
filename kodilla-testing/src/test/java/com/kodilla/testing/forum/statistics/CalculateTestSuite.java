package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.*;
import org.junit.*;
import static org.mockito.Mockito.*;
import java.util.*;

public class CalculateTestSuite {

    Calculate calculator;
    Statistics statistics;
    List<String> userList;

    @Before
    public void before() {
        calculator = new Calculate();
        statistics = mock(Statistics.class);
        userList = new ArrayList<>();
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionWhenNumberOfUserIs0() {
        //Given
        calculator.calculateAdvStatistics(statistics);
        //When
        when(statistics.usersNames()).thenReturn(userList);
        //Then
    }

    @Test
    public void shouldReturn1WhenUsersAre100AndPostsAre1000 () {
        //Given

        for (Integer i=0 ;i <100; i++) {
            userList.add("FooBar" + i.toString());
        }
        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statistics);

        //When
        double averagePostsPerUser =  calculator.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(100,userList.size());
        Assert.assertEquals(1000,statistics.postsCount());

        //@TODO: 13/11/2018 Question: why  assertEquals(double, double) is depricated
        Assert.assertEquals(10, (int)averagePostsPerUser);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionWhenNumberOfPostsAre0 () {
        //Given

        for (Integer i=0 ;i <100; i++) {
            userList.add("FooBar" + i.toString());
        }
        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(0);
        calculator.calculateAdvStatistics(statistics);

        //When
        double averagePostsPerUser =  calculator.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(100,userList.size());
        Assert.assertEquals(0,statistics.postsCount());
    }


    @Test
    public void shouldReturn1ForCommentsStatsWhenUsersAre100AndPostsAre1000AndCommentsAre0 () {
        //Given

        for (Integer i=0 ;i <100; i++) {
            userList.add("FooBar" + i.toString());
        }
        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        calculator.calculateAdvStatistics(statistics);

        //When
        double averageCommentsPerUser =  calculator.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(100,userList.size());
        Assert.assertEquals(1000,statistics.postsCount());
        Assert.assertEquals(0,statistics.commentsCount());

        Assert.assertEquals(0, (int)averageCommentsPerUser);
    }

    @Test
    public void shouldReturnAverageCommentsPerUserGreaterThanAveragePostsPerUserFor100Users () {
        //Given

        for (Integer i=0 ;i <100; i++) {
            userList.add("FooBar" + i.toString());
        }
        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statistics);

        //When
        double averageCommentsPerUser =  calculator.getAverageCommentsPerUser();
        double averagePostsPerUser =  calculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(100,userList.size());
        Assert.assertEquals(100,statistics.postsCount());
        Assert.assertEquals(1000,statistics.commentsCount());
        Assert.assertTrue(statistics.commentsCount()  > statistics.postsCount() );
        Assert.assertTrue(averageCommentsPerUser  > averagePostsPerUser );
    }

    @Test
    public void shouldReturnAveragePostsPerUserGreaterThanAverageCommentsPerUserFor100Users () {
        //Given

        for (Integer i=0 ;i <100; i++) {
            userList.add("FooBar" + i.toString());
        }
        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        calculator.calculateAdvStatistics(statistics);

        //When
        double averageCommentsPerUser =  calculator.getAverageCommentsPerUser();
        double averagePostsPerUser =  calculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(100,userList.size());
        Assert.assertEquals(1000,statistics.postsCount());
        Assert.assertEquals(100,statistics.commentsCount());
        Assert.assertTrue(statistics.commentsCount()  < statistics.postsCount() );
        Assert.assertTrue(averageCommentsPerUser  < averagePostsPerUser );
    }

}
