package model;

public class SleepStatistics {

    private int snoozeCount;
    private int successfulWakeUps;
    private double averageSleepHours;

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

    public void updateSleepHours(double hours){
        averageSleepHours = hours;
    }

    public double getAverageSleepHours(){
        return averageSleepHours;
    }
}