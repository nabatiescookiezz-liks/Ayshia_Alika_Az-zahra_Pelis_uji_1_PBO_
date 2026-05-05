/**
 * Abstract class Vehicle — mendefinisikan blueprint kendaraan.
 * Menggunakan abstraction: method startEngine() wajib diimplementasi subclass.
 */
public abstract class Vehicle {

    // Atribut dengan encapsulation (private + getter)
    private String merek;
    private String warna;
    private int tahunProduksi;

    // Constructor superclass
    public Vehicle(String merek, String warna, int tahunProduksi) {
        this.merek         = merek;
        this.warna         = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Method abstract — subclass WAJIB override (abstraction)
    public abstract void startEngine();

    // Method konkret — bisa langsung digunakan subclass (inheritance)
    public void tampilInfo() {
        System.out.println("Merek: " + merek + " | Warna: " + warna
                         + " | Tahun: " + tahunProduksi);
    }

    // Getter (encapsulation)
    public String getMerek()       { return merek; }
    public String getWarna()       { return warna; }
    public int    getTahunProduksi(){ return tahunProduksi; }
}
