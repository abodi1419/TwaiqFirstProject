package Anything.Challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(200,"13:00");
        System.out.println(car.calcArrivalTime());
        System.out.println(car.calcDuration());

    }
}
