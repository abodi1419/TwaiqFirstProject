package Project2;

public class Train extends Trip {

    public Train(String tripNumber, double distance, String startTime) {
        super(tripNumber, distance, startTime);
        speed=500;
    }

    @Override
    public int calcDuration() {
        double possibleLatency = 0.01;
        int time = calcTime();
        double hours = convertMinToHour(time);
        double fraction = (hours%1);
        int hour = (int)(hours-fraction);
        int min = (int)(fraction*60);
        int duration = hour*60+min;
        duration += duration*possibleLatency;
        return duration;
    }


}
