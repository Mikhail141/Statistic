package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateSumAvareg(long[] purchases) {
        long average = 0;
        for (long purchase : purchases) {
            average = purchase;
        }
        return average;
    }

    public long findMax(long[] purchases) {
        long monthMax = purchases[0];
        for (long purchase : purchases) {
            if (monthMax < purchase) {
                monthMax = purchase;
            }
        }
        return monthMax;
    }

    public long findMaxMin(long[] purchases) {
        long monthMin = purchases[0];
        for (long purchase : purchases) {
            if (monthMin > purchase) {
                monthMin = purchase;
            }
        }
        return monthMin;
    }

    public long findMaxUnderAverage(long[] purchases) {
        long sellunder = purchases[0];
        long average = 15;
        for (long purchase : purchases) {
            if (sellunder < purchase) {
                sellunder = purchase;
            }
        }
        return sellunder;
    }

    public long findMaxOverAverage(long[] purchases) {
        long sellOver = purchases[0];
        long average = 15;
        for (long purchase : purchases) {
            if (sellOver > purchase) {
                sellOver = purchase;
            }
        }
        return sellOver;
    }
}





