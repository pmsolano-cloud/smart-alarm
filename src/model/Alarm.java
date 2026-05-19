package model;

import java.time.LocalTime;

public class Alarm {

    private int id;
    private LocalTime time;
    private String label;
    private boolean active;
    private boolean ringing;

    private RepeatPattern repeatPattern;
    private SoundProfile soundProfile;
    private AlarmCategory category;

    public Alarm(
            int id,
            LocalTime time,
            String label,
            RepeatPattern repeatPattern,
            SoundProfile soundProfile,
            AlarmCategory category
    ) {

        if(label == null || label.isBlank()){
            throw new IllegalArgumentException(
                    "Etiqueta inválida"
            );
        }

        this.id = id;
        this.time = time;
        this.label = label;
        this.repeatPattern = repeatPattern;
        this.soundProfile = soundProfile;
        this.category = category;

        this.active = true;
        this.ringing = false;
    }

    public void activate(){
        active = true;
    }

    public void deactivate(){
        active = false;
    }

    public void startRinging(){
        ringing = true;
    }

    public void stop(){
        ringing = false;
    }

    public int getId() {
        return id;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isRinging() {
        return ringing;
    }

    public RepeatPattern getRepeatPattern() {
        return repeatPattern;
    }

    public SoundProfile getSoundProfile() {
        return soundProfile;
    }

    public AlarmCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {

        return "[" + id + "] "
                + label
                + " - "
                + time;
    }
}