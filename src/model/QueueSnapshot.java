package model;

import java.util.List;

public class QueueSnapshot {

    private int time;
    private String runningProcess;

    private List<String> tier1;
    private List<String> tier2;

    public QueueSnapshot(int time,
                         String runningProcess,
                         List<String> tier1,
                         List<String> tier2) {

        this.time = time;
        this.runningProcess = runningProcess;
        this.tier1 = tier1;
        this.tier2 = tier2;
    }

    public int getTime() {
        return time;
    }

    public String getRunningProcess() {
        return runningProcess;
    }

    public List<String> getTier1() {
        return tier1;
    }

    public List<String> getTier2() {
        return tier2;
    }
}



