package scheduler;

import simulation.SimulationResult;
import model.Process;
import java.util.List;

public class SJFScheduler implements Scheduler{
    @Override
    public SimulationResult simulate(
            List<Process> processes,
            int quantum,
            int contextSwitch) {

        // TODO: Implement Preemptive SJF

        return new SimulationResult();
    }

    @Override
    public String getName() {
        return "Preemptive SJF";
    }
}
