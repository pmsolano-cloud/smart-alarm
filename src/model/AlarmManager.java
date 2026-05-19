package model;

import java.util.ArrayList;
import java.util.List;

public class AlarmManager {

    private List<Alarm> alarms;

    public AlarmManager() {
        alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm){

        boolean exists = alarms.stream()
                .anyMatch(a ->
                        a.getTime().equals(alarm.getTime())
                                &&
                        a.getLabel().equalsIgnoreCase(
                                alarm.getLabel()
                        )
                );

        if(exists){
            throw new IllegalArgumentException(
                    "La alarma ya existe"
            );
        }

        alarms.add(alarm);
    }

    public void removeAlarm(int id){

        alarms.removeIf(
                alarm -> alarm.getId() == id
        );
    }

    public List<Alarm> getAlarms(){
        return alarms;
    }

    public List<Alarm> getActiveAlarms(){

        return alarms.stream()
                .filter(Alarm::isActive)
                .toList();
    }
}