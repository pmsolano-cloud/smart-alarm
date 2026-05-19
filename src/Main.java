import model.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        AlarmManager manager =
                new AlarmManager();

        RepeatPattern repeat =
                new RepeatPattern(
                        Set.of(
                                DayOfWeek.MONDAY,
                                DayOfWeek.WEDNESDAY
                        )
                );

        SoundProfile sound =
                new SoundProfile(
                        "Morning Birds",
                        70
                );

        Alarm alarm =
                new Alarm(
                        1,
                        LocalTime.of(7,30),
                        "Ir a clase",
                        repeat,
                        sound,
                        AlarmCategory.STUDY
                );

        manager.addAlarm(alarm);

        manager.getAlarms()
                .forEach(System.out::println);
    }
}