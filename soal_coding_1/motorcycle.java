/**
 * Class Motorcycle — mewarisi Vehicle (inheritance).
 * Override startEngine() dengan logika berbeda dari Car (polymorphism).
 */
public class Motorcycle extends Vehicle {

    // Atribut spesifik motor (encapsulation)
    private String tipeMotor; // matic, manual, sport
    private int    cc;        // kubikasi mesin

    // Constructor Motorcycle — chaining ke superclass
    public Motorcycle(String merek, String warna, int tahunProduksi,
                      String tipeMotor, int cc) {
        super(merek, warna, tahunProduksi); // constructor chaining
        this.tipeMotor = tipeMotor;
        this.cc        = cc;
    }

    /**
     * Override method abstract dari Vehicle (polymorphism).
     * Implementasi berbeda dari Car — motor pakai mesin bensin.
     */
    @Override
    public void startEngine() {
        System.out.println("[Motorcycle] " + getMerek()
            + " dinyalakan — suara mesin " + cc + "cc meraung! 🏍️ VROOM!");
    }

    // Getter (encapsulation)
    public String getTipeMotor() { return tipeMotor; }
    public int    getCc()        { return cc; }

    @Override
    public void tampilInfo() {
        super.tampilInfo(); // panggil method parent
        System.out.println("Tipe: " + tipeMotor + " | CC: " + cc);
    }
}
