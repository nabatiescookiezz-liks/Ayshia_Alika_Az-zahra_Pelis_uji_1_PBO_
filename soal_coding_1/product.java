/**
 * Abstract class Product — blueprint semua produk di kasir.
 * Abstraction: subclass wajib implementasi getNama() dan getHargaDasar().
 */
public abstract class Product {

    // Atribut umum semua produk (encapsulation)
    private String kode;
    private int    stok;

    public Product(String kode, int stok) {
        this.kode = kode;
        this.stok = stok;
    }

    // Method abstract — wajib diisi subclass (abstraction)
    public abstract String getNama();
    public abstract double getHargaDasar();

    // Method konkret yang bisa dipakai semua subclass (inheritance)
    public double getHargaAkhir() {
        return getHargaDasar(); // default: tanpa pajak
    }

    public void tampilProduk() {
        System.out.printf("  %-20s Rp%,10.0f%n", getNama(), getHargaAkhir());
    }

    // Getter (encapsulation)
    public String getKode() { return kode; }
    public int    getStok() { return stok; }
}
