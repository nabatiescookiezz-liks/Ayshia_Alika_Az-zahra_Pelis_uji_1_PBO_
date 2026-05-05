/**
 * Class Car — mewarisi Vehicle (inheritance) dan implement Electric (interface).
 * Menerapkan polymorphism dengan override startEngine().
 */
public class Car extends Vehicle implements Electric {

    // Atribut tambahan spesifik Car (encapsulation)
    private int jumlahPintu;
    private int kapasitasBaterai; // kWh

    // Constructor Car — chaining ke superclass dengan super()
    public Car(String merek, String warna, int tahunProduksi,
               int jumlahPintu, int kapasitasBaterai) {
        super(merek, warna, tahunProduksi); // constructor chaining
        this.jumlahPintu       = jumlahPintu;
        this.kapasitasBaterai  = kapasitasBaterai;
    }

    /**
     * Override method abstract dari Vehicle (polymorphism).
     * Implementasi spesifik untuk mobil listrik.
     */
    @Override
    public void startEngine() {
        System.out.println("[Car] " + getMerek()
            + " menyala dengan senyap — motor listrik aktif! ⚡");
    }

    /**
     * Implementasi method dari interface Electric.
     * Ini adalah polymorphism via interface.
     */
    @Override
    public void chargeBattery() {
        System.out.println("[Car] " + getMerek()
            + " sedang mengisi daya baterai " + kapasitasBaterai + " kWh...");
    }

    // Getter tambahan (encapsulation)
    public int getJumlahPintu()      { return jumlahPintu; }
    public int getKapasitasBaterai() { return kapasitasBaterai; }

    @Override
    public void tampilInfo() {
        super.tampilInfo(); // panggil method parent
        System.out.println("Pintu: " + jumlahPintu
                         + " | Baterai: " + kapasitasBaterai + " kWh");
    }
}
