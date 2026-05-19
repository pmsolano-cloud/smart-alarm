package service;

import model.Alarm;

import java.time.LocalTime;

public class SnoozeManager {

    private static final int SNOOZE_MINUTES = 5;

    public LocalTime snooze(Alarm alarm){

        return alarm.getTime()
                .plusMinutes(SNOOZE_MINUTES);
    }
}