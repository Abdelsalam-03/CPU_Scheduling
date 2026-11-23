package model;

public class ProcessStats {
    private String processId;

    private int arrivalTime;
    private int burstTime;

    private int firstStartTime;
    private int finishTime;

    public ProcessStats(String processId,
                        int arrivalTime,
                        int burstTime,
                        int firstStartTime,
                        int finishTime) {

        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.firstStartTime = firstStartTime;
        this.finishTime = finishTime;
    }

    public int getWaitingTime() {
        return finishTime - arrivalTime - burstTime;
    }

    public int getTurnaroundTime() {
        return finishTime - arrivalTime;
    }

    public int getResponseTime() {
        return firstStartTime - arrivalTime;
    }

    public String getProcessId() {
        return processId;
    }

    public int getFinishTime() {
        return finishTime;
    }
}
