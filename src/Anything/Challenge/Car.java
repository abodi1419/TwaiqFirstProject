package Anything.Challenge;

public class Car extends Trip{

    public Car(double distance, String startTime) {
        super(distance, startTime);
    }

    @Override
    public int calcDuration() {
        speed = 120;
        return calcTime();
    }

}
