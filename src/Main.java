
import data.TestCases;
import model.Process;
import scheduler.ACSScheduler;
import scheduler.SJFScheduler;
import scheduler.Scheduler;
import simulation.SimulationEngine;
import simulation.SimulationResult;
import utils.GanttChart;
import utils.MetricsCalculator;

import java.util.List;


public class Main {


    public static void main(String[] args) {

        int quantum = 3;
        int contextSwitch = 1;

        List<Process> processes =
                TestCases.getTestCase1();

        SimulationEngine engine = new SimulationEngine();

        Scheduler[] schedulers = {
                new SJFScheduler(),
                new ACSScheduler()
        };

        for (Scheduler scheduler : schedulers) {

            System.out.println("\n================================");
            System.out.println(scheduler.getName());
            System.out.println("================================");

            SimulationResult result = engine.run(
                    scheduler,
                    processes,
                    quantum,
                    contextSwitch
            );

            GanttChart.print(result.getExecutionSegments());

            System.out.println(
                    "Average Waiting Time: " +
                            MetricsCalculator.calculateAverageWaitingTime(
                                    result.getProcessStats()
                            )
            );

            System.out.println(
                    "Average Turnaround Time: " +
                            MetricsCalculator.calculateAverageTurnaroundTime(
                                    result.getProcessStats()
                            )
            );
        }
    }
}
