package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void calculateSumAverage() {
        StatsService service = new StatsService();
        long[] purchases = {180 / 12};
        long expected = 15;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void findMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] monthMax = {8};
        long expected = 8;
        long actual = service.findMax(monthMax);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonthMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] monthMin = {9};
        long expected = 9;
        long actual = service.findMax(monthMin);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxUnderAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] sellunder = {5};
        long expected = 5;
        long actual = service.findMax(sellunder);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxOverAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] sellOver = {5};
        long expected = 5;
        long actual = service.findMax(sellOver);

        assertEquals(expected, actual);
    }
}


