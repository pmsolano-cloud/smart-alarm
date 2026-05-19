package service;

import model.Alarm;
import model.AlarmManager;

public class VacationMode {

    public void activate(
            AlarmManager manager
    ){

        for(Alarm alarm : manager.getAlarms()){
            alarm.deactivate();
        }
    }
}