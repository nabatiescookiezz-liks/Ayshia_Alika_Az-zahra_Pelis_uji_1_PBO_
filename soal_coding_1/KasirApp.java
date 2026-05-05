import java.util.ArrayList;
import java.util.List;

/**
 * KasirApp — sistem kasir sederhana.
 * Mendemonstrasikan polymorphism saat menghitung total belanja.
 */
public class KasirApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("       SISTEM KASIR SEDERHANA");
        System.out.println("       OOP: Polymorphism + Interface");
        System.out.println("===========================================\n");

        // --------------------------------------------------------
        // Membuat produk (Food & Beverage extend Product)
        // --------------------------------------------------------
        Food      nasiGoreng = new Food("F001", "Nasi Goreng Spesial", 25000, "makanan_berat", 10);
        Food      ayamGeprek = new Food("F002", "Ayam Geprek",         20000, "makanan_berat", 15);
        Food      pudingCoklat= new Food("F003", "Puding Coklat",       8000, "dessert",       20);

        Beverage  esTeh      = new Beverage("B001", "Es Teh Manis",     5000, true,  30);
        Beverage  jusJeruk   = new Beverage("B002", "Jus Jeruk",       12000, true,  20);
        Beverage  airMineral = new Beverage("B003", "Air Mineral",      4000, false, 50);

        // --------------------------------------------------------
        // POLYMORPHISM: semua disimpan dalam List<Product>
        // Tidak perlu tahu apakah Food atau Beverage saat loop
        // --------------------------------------------------------
        List<Product> keranjang = new ArrayList<>();
        keranjang.add(nasiGoreng);
        keranjang.add(ayamGeprek);
        keranjang.add(esTeh);
        keranjang.add(jusJeruk);
        keranjang.add(pudingCoklat);
        keranjang.add(airMineral);

        // --------------------------------------------------------
        // Tampilkan struk belanja
        // --------------------------------------------------------
        System.out.println("STRUK BELANJA:");
        System.out.println("-------------------------------------------");
        System.out.printf("  %-20s %12s%n", "Produk", "Harga");
        System.out.println("-------------------------------------------");

        double totalBelanja  = 0;
        double totalPajak    = 0;

        for (Product p : keranjang) {
            p.tampilProduk(); // POLYMORPHISM: tiap class punya tampilProduk() berbeda

            totalBelanja += p.getHargaAkhir();

            // Hitung total pajak (hanya untuk Taxable)
            if (p instanceof Taxable t) { // Pattern matching Java 16+
                totalPajak += t.hitungPajak(p.getHargaDasar());
            }
        }

        System.out.println("-------------------------------------------");
        System.out.printf("  %-20s Rp%,10.0f%n", "Subtotal (before tax)",
                          totalBelanja - totalPajak);
        System.out.printf("  %-20s Rp%,10.0f%n", "Total Pajak", totalPajak);
        System.out.println("===========================================");
        System.out.printf("  %-20s Rp%,10.0f%n", "TOTAL BAYAR", totalBelanja);
        System.out.println("===========================================");
        System.out.println("\nTerima kasih telah berbelanja! 🛒");
    }
}
