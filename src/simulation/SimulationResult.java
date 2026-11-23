package simulation;

import model.ExecutionSegment;
import model.ProcessStats;
import model.QueueSnapshot;

import java.util.ArrayList;
import java.util.List;

public class SimulationResult {


    private List<ProcessStats> processStats;
    private List<ExecutionSegment> executionSegments;
    private List<QueueSnapshot> queueSnapshots;

    public SimulationResult() {

        processStats = new ArrayList<>();
        executionSegments = new ArrayList<>();
        queueSnapshots = new ArrayList<>();
    }

    public List<ProcessStats> getProcessStats() {
        return processStats;
    }

    public List<ExecutionSegment> getExecutionSegments() {
        return executionSegments;
    }

    public List<QueueSnapshot> getQueueSnapshots() {
        return queueSnapshots;
    }
}
