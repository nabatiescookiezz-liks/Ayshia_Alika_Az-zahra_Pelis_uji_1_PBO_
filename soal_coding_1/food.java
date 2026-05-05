/**
 * Class Food — produk makanan, kena pajak 10% (implement Taxable).
 * Mewarisi Product (inheritance) dan implement Taxable (interface).
 */
public class Food extends Product implements Taxable {

    private String nama;
    private double hargaDasar;
    private String kategori; // misal: makanan_berat, snack, dessert

    public Food(String kode, String nama, double hargaDasar,
                String kategori, int stok) {
        super(kode, stok); // constructor chaining ke Product
        this.nama       = nama;
        this.hargaDasar = hargaDasar;
        this.kategori   = kategori;
    }

    @Override
    public String getNama()        { return nama; }

    @Override
    public double getHargaDasar()  { return hargaDasar; }

    /** Pajak makanan 10% (PPN) */
    @Override
    public double getTaxRate()     { return 0.10; }

    /**
     * Override getHargaAkhir() — tambahkan pajak ke harga.
     * Polymorphism: Food hitung harga dengan pajak.
     */
    @Override
    public double getHargaAkhir() {
        return hargaDasar + hitungPajak(hargaDasar);
    }

    public String getKategori() { return kategori; }

    @Override
    public void tampilProduk() {
        System.out.printf("  %-20s Rp%,10.0f  [+PPN %.0f%%]%n",
                          nama, getHargaAkhir(), getTaxRate() * 100);
    }
}
