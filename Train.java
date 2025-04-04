package praktic.inheritance.transportation; // Package class Train

public class Train extends Vehicle { // Membuat class Train yang merupakan subclass dari class Vehicle
    private static final int FIXED_FARE = 10000; // Atribut untuk tarif tetap kereta

    public Train(String name, int capacity, String route) { // Konstruktor untuk inisialisasi objek Train
        super(name, capacity, route); // Memanggil konstruktor superclass Vehicle
    }

    @Override
    public void calculateFare() { // Method untuk menghitung total tarif perjalanan kereta
        int totalFare = getCurrentPassengers() * FIXED_FARE; // Menghitung total tarif kereta menggunakan perhitungan
                                                             // yang telah ditentukan
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare); // Menampilkan total tarif perjalanan
                                                                              // kereta
    }

    @Override
    public void printInfo() { // Method untuk menampilkan informasi kereta
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
    }
}
