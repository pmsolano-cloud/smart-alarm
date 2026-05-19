package model;

public class SleepStatistics {

    private int snoozeCount;
    private int successfulWakeUps;

    public void registerSnooze(){
        snoozeCount++;
    }

    public void registerWakeUp(){
        successfulWakeUps++;
    }

    public int getSnoozeCount() {
        return snoozeCount;
    }

    public int getSuccessfulWakeUps() {
        return successfulWakeUps;
    }
}