package Anything.Challenge;

public abstract class Trip {
    private String tripNumber = "1";
    private double distance = 700;
    protected double speed;
    private String startTime="14:00";

    public Trip() {
    }

    public Trip(double distance, String startTime) {
        this.distance = distance;
        this.startTime = startTime;
    }

    public abstract int calcDuration();

    public  double convertMinToHour(int min){
        return min/60.0;
    }

    public String calcArrivalTime(){
        int duration = calcDuration();
        double hours = convertMinToHour(duration);
        System.out.println("Hours: "+hours);
        int t = (int) ( 100 * hours * 60 );
        int hour = t/3600;
        t %= 3600;
        int min = t/60;
        String [] x = startTime.split(":");
        int h = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        h+= hour;
        m+=min;
        h%=24;
        m%=60;
        return (h+":"+m);
    }

    public String calcDiff(){
        String [] x = startTime.split(":");
        int h1 = Integer.parseInt(x[0]);
        int m1 = Integer.parseInt(x[1]);
        String [] arrTime= calcArrivalTime().split(":");
        int h2 = Integer.parseInt(arrTime[0]);
        int m2 = Integer.parseInt(arrTime[1]);

        h1-=h2;
        m1-=m2;
        m1%=60;
        h1%=24;
        return h1+":"+m1;
    }

    public int calcTime(){
        System.out.println("Time: "+(distance/speed)*60);
        return (int) (distance/speed)*60;
    }


}
