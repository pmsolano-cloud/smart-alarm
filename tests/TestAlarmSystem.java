import model.*;
import service.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

public class TestAlarmSystem {

    public static void main(String[] args) {

        System.out.println("INICIANDO TESTS DEL SISTEMA DE ALARMAS\n");

        AlarmManager manager = new AlarmManager();

        Alarm alarm1 = new Alarm(
                1,
                LocalTime.of(7, 0),
                "Trabajo",
                new RepeatPattern(Set.of(DayOfWeek.MONDAY)),
                new SoundProfile("Beep", 50),
                AlarmCategory.WORK
        );

        Alarm alarm2 = new Alarm(
                2,
                LocalTime.of(7, 5),
                "Estudio",
                new RepeatPattern(Set.of(DayOfWeek.TUESDAY)),
                new SoundProfile("Nature", 60),
                AlarmCategory.STUDY
        );

        manager.addAlarm(alarm1);
        manager.addAlarm(alarm2);

        System.out.println("ALARMAS CREADAS:");
        manager.getAlarms().forEach(System.out::println);

        System.out.println("\nALARMAS ACTIVAS:");
        manager.getActiveAlarms().forEach(System.out::println);

        System.out.println("\nTEST FINALIZADO CORRECTAMENTE");
    }
}