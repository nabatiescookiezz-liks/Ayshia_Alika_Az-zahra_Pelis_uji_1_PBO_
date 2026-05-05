/**
 * Class Beverage — produk minuman, kena pajak 5%.
 * Mewarisi Product (inheritance) dan implement Taxable (interface).
 */
public class Beverage extends Product implements Taxable {

    private String nama;
    private double hargaDasar;
    private boolean dingin; // True = minuman dingin

    public Beverage(String kode, String nama, double hargaDasar,
                    boolean dingin, int stok) {
        super(kode, stok);
        this.nama       = nama;
        this.hargaDasar = hargaDasar;
        this.dingin     = dingin;
    }

    @Override
    public String getNama()       { return nama + (dingin ? " (Es)" : ""); }

    @Override
    public double getHargaDasar() { return hargaDasar; }

    /** Pajak minuman lebih rendah: 5% */
    @Override
    public double getTaxRate()    { return 0.05; }

    /**
     * Override getHargaAkhir() dengan pajak 5%.
     * Polymorphism berbeda dari Food (10%).
     */
    @Override
    public double getHargaAkhir() {
        return hargaDasar + hitungPajak(hargaDasar);
    }

    @Override
    public void tampilProduk() {
        System.out.printf("  %-20s Rp%,10.0f  [+Tax %.0f%%]%n",
                          getNama(), getHargaAkhir(), getTaxRate() * 100);
    }
}
