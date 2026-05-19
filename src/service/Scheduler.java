package service;

import model.Alarm;

import java.util.Comparator;
import java.util.List;

public class Scheduler {

    public List<Alarm> getUpcomingAlarms(
            List<Alarm> alarms
    ){

        return alarms.stream()
                .filter(Alarm::isActive)
                .sorted(
                        Comparator.comparing(
                                Alarm::getTime
                        )
                )
                .toList();
    }
}