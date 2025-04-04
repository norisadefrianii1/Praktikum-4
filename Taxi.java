package praktic.inheritance.transportation;

public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000;

    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare(int distance) {
        int totalFare = getCurrentPassengers() * distance * FARE_PER_KM;
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }

    public void printInfo() {
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak rute: 10 km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
    }
}
