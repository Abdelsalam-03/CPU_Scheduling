package scheduler;

import simulation.SimulationResult;
import model.Process;
import java.util.List;

public class ACSScheduler implements Scheduler {

    private static final int AGING_INTERVAL = 4;

    @Override
    public SimulationResult simulate(
            List<Process> processes,
            int quantum,
            int contextSwitch) {

        // TODO: Tier 1 - Round Robin

        // TODO: Tier 2 - Non-Preemptive Priority

        // TODO: Aging Mechanism

        // TODO: Record Queue Snapshots

        return new SimulationResult();
    }

    @Override
    public String getName() {
        return "Adaptive Container Scheduler";
    }
}
