package Project2;

public abstract class Trip {
    private String tripNumber;
    private double distance;
    protected double speed;
    private String startTime;

    public Trip() {
    }

    public Trip(String tripNumber, double distance, String startTime) {
        this.tripNumber = tripNumber;
        this.distance = distance;
        this.startTime = startTime;
    }

    public abstract int calcDuration();

    public  double convertMinToHour(int min){
        return min/60.0;
    }

    public String calcArrivalTime(){

        double hours = convertMinToHour(calcDuration());
        double fraction = (hours%1);
        int hour = (int)(hours-fraction);
        String [] sTime = startTime.split(":");
        int sHour = Integer.parseInt(sTime[0]);
        int sMin = Integer.parseInt(sTime[1]);
        int arrHour = (sHour+hour)%24;
        int arrMin = sMin+(int) (fraction*60);
        if(arrMin>59){
            arrHour++;
            arrMin-=60;
        }

        return (((arrHour<10)?"0"+arrHour:arrHour)+":"+(arrMin<10?"0"+arrMin:arrMin));
    }

    public int calcTime(){
        return (int) ((distance/speed)*60);
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public String getStartTime() {
        return startTime;
    }
}
