package utils;

import model.ExecutionSegment;

import java.util.List;

public class GanttChart {


    public static void print(
            List<ExecutionSegment> segments) {

        System.out.println("\n========== GANTT CHART ==========");

        for (ExecutionSegment segment : segments) {

            System.out.println(
                    segment.getStartTime() + " -> " +
                            segment.getEndTime() + " : " +
                            segment.getProcessId() +
                            " [" + segment.getType() + "]"
            );
        }

        System.out.println("=================================");
    }
}
