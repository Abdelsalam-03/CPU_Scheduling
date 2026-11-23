package utils;

import model.ProcessStats;

import java.util.List;

public class MetricsCalculator {


    public static double calculateAverageWaitingTime(
            List<ProcessStats> stats) {

        if (stats.isEmpty()) return 0;

        double total = 0;

        for (ProcessStats process : stats) {
            total += process.getWaitingTime();
        }

        return total / stats.size();
    }

    public static double calculateAverageTurnaroundTime(
            List<ProcessStats> stats) {

        if (stats.isEmpty()) return 0;

        double total = 0;

        for (ProcessStats process : stats) {
            total += process.getTurnaroundTime();
        }

        return total / stats.size();
    }

    public static double calculateAverageResponseTime(
            List<ProcessStats> stats) {

        if (stats.isEmpty()) return 0;

        double total = 0;

        for (ProcessStats process : stats) {
            total += process.getResponseTime();
        }

        return total / stats.size();
    }
}
