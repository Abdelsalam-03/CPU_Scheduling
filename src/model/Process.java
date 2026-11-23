package model;

public class Process {
    private String processId;
    private int arrivalTime;
    private int burstTime;
    private int priority;


    public Process(String processId, int arrivalTime,
                   int burstTime, int priority) {

        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    public String getProcessId() {
        return processId;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }
}
