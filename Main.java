package praktic.inheritance.mains; //Package utama class Main

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Taxi;
import praktic.inheritance.transportation.Train;

public class Main {
    public static void main(String[] args) {
        // Simulasi perjalanan dengan Bus
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B"); // Membuat objek Bus dengan kapasitas 50
                                                                              // penumpang
        bus.startJourney(); // Memulai perjalanan bus
        bus.boardPassengers(30); // Menambahkan 30 penumpang ke dalam bus
        bus.boardPassengers(100); // Mencoba menaikkan 100 penumpang ke dalam bus (Tetapi akan gagal karena
                                  // melebihi kapasitas
        bus.printInfo();
        bus.calculateFare(5); // Menghitung total tarif berdasarkan jumlah pemberhentian
        bus.stopJourney(); // Menghentikan perjalanan bus
        bus.dropPassengers(30); // Menurunkan 30 penumpang dari bus
        System.out.println(""); // Baris kosong untuk pemisah
        System.out.println("------------------------------"); // Sebagai pemisah output agar lebih rapi

        // Simulasi perjalanan dengan Kereta
        System.out.println(""); // Baris kosong untuk pemisah
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat"); // Membuat objek Train
                                                                                              // dengan kapasitas 200
                                                                                              // penumpang
        train.startJourney(); // Memulai perjalanan kereta
        train.boardPassengers(150); // Menambahkan 150 penumpang ke dalam kereta
        train.boardPassengers(300); // Mencoba menaikkan 300 penumpang (Tetapi akan gagal karena melebih kapasitas
                                    // kereta
        train.printInfo();
        train.calculateFare(); // Menghitung total tarif perjalanan kereta
        train.stopJourney(); // Menghentikan perjalanan kereta
        train.dropPassengers(150); // Menurunkan 150 penumpang dari kereta
        System.out.println(""); // Baris kosong untuk pemisah
        System.out.println("------------------------------"); // Sebagai pemisah output agar lebih rapi

        // Simulasi perjalanan dengan Taksi
        System.out.println(""); // Baris kosong untuk pemisah
        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel"); // Membuat objek Taxi dengan kapasitas 4 penumpang
        taxi.startJourney(); // Memulai perjalanan Taxi
        taxi.boardPassengers(3); // Menambahkan 3 penumpang ke dalam taxi
        taxi.boardPassengers(10); // Mencoba menaikkan 10 penumpang (Tetapi akan gagal karena melebihi kapasitas)
        taxi.printInfo();
        taxi.calculateFare(10); // Menghitung total tarif perjalanan taxi berdasarkan jarak
        taxi.stopJourney(); // Menghentikan perjalanan taxi
        taxi.dropPassengers(3); // Menurunkan 3 penumpang dari taxi
    }
}
