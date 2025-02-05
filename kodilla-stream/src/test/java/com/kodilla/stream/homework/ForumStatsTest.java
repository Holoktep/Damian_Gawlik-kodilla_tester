package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void testAveragePostsForUsersAbove40() {
        double avg = ForumStats.avg3();
        assertEquals(2.25, avg, 0.01);
    }

    @Test
    void testAveragePostsForUsersBelow40() {
        double avg = ForumStats.avg4();
        assertEquals(2382.0, avg, 0.01);
    }
}