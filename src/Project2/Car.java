package Project2;

public class Car extends Trip {

    public Car(String tripNumber, double distance, String startTime, double speed) {
        super(tripNumber, distance, startTime);
        this.speed = speed;
    }

    @Override
    public int calcDuration() {
        // suppose we have possible latency 0.2 based on traffic
        double possibleLatency = 0.2;
        int time = calcTime();
        double hours = convertMinToHour(time);
        double fraction = (hours%1);
        int hour = (int)(hours-fraction);
        int min = (int)(fraction*60);
        int duration = hour*60+min;
        duration += duration*possibleLatency;
        return duration;
//        double fraction = possibleLatency%1;
//        int lateHours = (int)(possibleLatency-fraction);
//        String [] aTime = arrivalTime.split(":");
//        int aHour = Integer.parseInt(aTime[0]);
//        int aMin = Integer.parseInt(aTime[1]);
//        int arrHour = (aHour+lateHours)%24;
//        int arrMin = aMin+(int) (fraction*60);
//        if(arrMin>59){
//            arrHour++;
//            arrMin-=60;
//        }
//        String newArrTime = arrHour+":"+arrMin;
//        return arrHour*60+arrMin;
    }



}
