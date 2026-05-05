/**
 * Interface Taxable — kontrak untuk produk yang kena pajak.
 * Class yang implement WAJIB definisikan persentase dan kalkulasi pajak.
 */
public interface Taxable {

    double getTaxRate(); // persentase pajak (0.0 - 1.0)

    // Default method: hitung nominal pajak dari harga dasar
    default double hitungPajak(double hargaDasar) {
        return hargaDasar * getTaxRate();
    }
}
