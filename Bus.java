package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000;

    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare(int stops) {
        int totalFare = getCurrentPassengers() * stops * FARE_PER_STOP;
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }

    @Override
    public void printInfo() {
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: 5");
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
    }
}
