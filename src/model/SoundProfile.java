package model;

public class SoundProfile {

    private String soundName;
    private int volume;

    public SoundProfile(
            String soundName,
            int volume
    ) {

        if(volume < 0 || volume > 100){
            throw new IllegalArgumentException(
                    "Volumen inválido"
            );
        }

        this.soundName = soundName;
        this.volume = volume;
    }

    public String getSoundName() {
        return soundName;
    }

    public int getVolume() {
        return volume;
    }
}