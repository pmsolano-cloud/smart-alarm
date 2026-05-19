package service;

public class CircadianMode {

    private int currentVolume;
    private int targetVolume;

    public CircadianMode(int targetVolume) {

        this.currentVolume = 10;
        this.targetVolume = targetVolume;
    }

    public void increaseVolumeGradually(){

        while(currentVolume < targetVolume){

            currentVolume += 10;

            System.out.println(
                    "Volumen actual: "
                            + currentVolume
            );
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}