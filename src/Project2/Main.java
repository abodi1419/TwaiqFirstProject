package Project2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car trip: ");
        Car car = new Car("1",200,"23:59",120);
        printTrip(car);

        System.out.println("Airplane trip:");
        Airplane airplane = new Airplane("54333",800,"14:00");
        printTrip(airplane);

        System.out.println("Train trip:");
        Train train = new Train("54333",550,"14:00");
        printTrip(train);

    }

    public static void printTrip(Trip trip){
        System.out.println("\t\tTrip number: "+trip.getTripNumber());
        System.out.println("\t\tStart time: "+trip.getStartTime());
        System.out.println("\t\t~Arrival time: "+trip.calcArrivalTime());
        System.out.println("\t\t~Trip duration: "+trip.calcDuration()+" min/s");
    }
}
