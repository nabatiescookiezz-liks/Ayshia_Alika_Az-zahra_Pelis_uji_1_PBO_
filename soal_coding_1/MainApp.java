/**
 * MainApp — class utama untuk demonstrasi OOP.
 * Menampilkan: abstraction, inheritance, interface, dan polymorphism.
 */
public class MainApp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("   DEMO OOP: Vehicle System");
        System.out.println("   Abstraction | Inheritance | Polymorphism");
        System.out.println("============================================\n");

        // --------------------------------------------------------
        // Membuat object dari subclass (inheritance dari Vehicle)
        // --------------------------------------------------------
        Car        car  = new Car("Tesla Model 3", "Putih", 2024, 4, 75);
        Motorcycle moto = new Motorcycle("Honda CBR", "Merah", 2023, "sport", 600);

        // --------------------------------------------------------
        // POLYMORPHISM via array tipe superclass (Vehicle)
        // Satu tipe referensi, banyak bentuk objek
        // --------------------------------------------------------
        Vehicle[] kendaraan = { car, moto };

        System.out.println("--- INFO KENDARAAN ---");
        for (Vehicle v : kendaraan) {
            v.tampilInfo();   // polymorphism: tampilInfo() berbeda tiap class
            v.startEngine();  // polymorphism: perilaku berbeda (Car vs Motorcycle)
            System.out.println();
        }

        // --------------------------------------------------------
        // POLYMORPHISM via interface Electric
        // Hanya Car yang implement Electric
        // --------------------------------------------------------
        System.out.println("--- FITUR ELECTRIC ---");
        for (Vehicle v : kendaraan) {
            if (v instanceof Electric e) {       // Pattern matching Java 16+
                e.chargeBattery();               // hanya Car yang masuk sini
                e.cekStatus();                   // default method dari interface
            } else {
                System.out.println("[" + v.getMerek() + "] Bukan kendaraan listrik.");
            }
        }

        System.out.println("\n============================================");
        System.out.println("   Demo selesai!");
        System.out.println("============================================");
    }
}
