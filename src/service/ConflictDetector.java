package service;

import model.Alarm;

import java.time.Duration;
import java.util.List;

public class ConflictDetector {

    public boolean hasConflict(
            Alarm newAlarm,
            List<Alarm> alarms
    ){

        for(Alarm alarm : alarms){

            long minutes =
                    Math.abs(
                            Duration.between(
                                    alarm.getTime(),
                                    newAlarm.getTime()
                            ).toMinutes()
                    );

            if(minutes < 5){
                return true;
            }
        }

        return false;
    }
}