package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Calculate {
    double averagePostsPerUser = 0;
    double averageCommentsPerUser = 0;
    double averageCommentsPerPost = 0;

    public void calculateAdvStatistics(Statistics statistics) {

        double usersNb = statistics.usersNames().size();
        double postNb = statistics.postsCount();
        double commentsNb = statistics.commentsCount();

        if(usersNb > 0) {
            averagePostsPerUser = postNb / usersNb;
            averageCommentsPerUser = commentsNb / usersNb;
        } else  {
            throw new ArithmeticException();
        }

        if(postNb > 0) {
            averageCommentsPerPost = commentsNb / postNb;
        } else  {
            throw new ArithmeticException();
        }
    }
    public void showStatistics() {
        System.out.println("Statistics:");
        System.out.println("Average posts per post:" + averagePostsPerUser);
        System.out.println("Average comments per user:" + averageCommentsPerUser);
        System.out.println("Average comments per post:" + averageCommentsPerPost);
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
