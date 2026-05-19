package model;

import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Set;

public class RepeatPattern {

    private Set<DayOfWeek> repeatDays;

    public RepeatPattern(Set<DayOfWeek> repeatDays) {
        this.repeatDays = repeatDays;
    }

    public boolean repeatsOn(DayOfWeek day){
        return repeatDays.contains(day);
    }

    public static RepeatPattern weekdays(){

        return new RepeatPattern(EnumSet.of(
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY
        ));
    }

    public static RepeatPattern weekends(){

        return new RepeatPattern(EnumSet.of(
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY
        ));
    }

    public static RepeatPattern everyDay(){

        return new RepeatPattern(
                EnumSet.allOf(DayOfWeek.class)
        );
    }
}