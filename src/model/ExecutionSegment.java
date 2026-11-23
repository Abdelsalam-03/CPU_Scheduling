package model;

public class ExecutionSegment{

    private String processId;
    private String type;

    private int startTime;
    private int endTime;

    public ExecutionSegment(String processId,
                            String type,
                            int startTime,
                            int endTime) {

        this.processId = processId;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getProcessId() {
        return processId;
    }

    public String getType() {
        return type;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getDuration() {
        return endTime - startTime;
    }
}