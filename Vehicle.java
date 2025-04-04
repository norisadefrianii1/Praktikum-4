package praktic.inheritance.transportation;

public class Vehicle {
    private String name;
    private int capacity;
    private String route;
    private int currentPassengers;

    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    public void boardPassengers(int count) {
        if (currentPassengers + count > capacity) {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang");
        } else {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam " + name);
        }
    }

    public void dropPassengers(int count) {
        if (currentPassengers < count) {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        } else {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun dari " + name);
        }
    }

    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    public void stopJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
        if (currentPassengers > 0) {
            dropPassengers(currentPassengers); // Semua penumpang turun di tujuan akhir
        }
    }

    public void calculateFare() {
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void printInfo() {
    }
}
