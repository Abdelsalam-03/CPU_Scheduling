package simulation;

import scheduler.Scheduler;
import model.Process;
import java.util.List;

public class SimulationEngine {
    public SimulationResult run(
            Scheduler scheduler,
            List<Process> processes,
            int quantum,
            int contextSwitch) {

        return scheduler.simulate(
                processes,
                quantum,
                contextSwitch
        );
    }
}
