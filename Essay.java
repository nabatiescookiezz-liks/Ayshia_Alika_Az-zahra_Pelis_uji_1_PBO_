/**
 * ============================================================
 * ESSAY.JAVA - JAWABAN SOAL ESSAY
 * Mata Kuliah : Pemrograman Berorientasi Objek
 * Dosen       : Insan Taufik, M.Kom
 * Universitas : Universitas Negeri Medan 2026
 * ============================================================
 */
public class Essay {

    /*
     * ============================================================
     * SOAL ESSAY 1:
     * Jelaskan prinsip encapsulation, inheritance, polymorphism,
     * dan abstraction serta analogi kehidupan nyata.
     * ============================================================
     *
     * 1. ENCAPSULATION
     * ---------------------------------------------------------------
     * Definisi: Menyembunyikan data internal class dari akses langsung
     *   luar. Data hanya bisa diakses/diubah via getter/setter.
     *
     * Manfaat:
     *   - Melindungi integritas data dari perubahan tidak sah.
     *   - Memudahkan pemeliharaan sistem.
     *   - Meningkatkan keamanan.
     *
     * Analogi: BRANKAS BANK — Nasabah tidak langsung ambil uang.
     *   Harus lewat TELLER (method) yang verifikasi identitas dulu.
     *   Data di brankas (balance) terlindungi dari akses sembarangan.
     *
     * 2. INHERITANCE
     * ---------------------------------------------------------------
     * Definisi: Subclass mewarisi atribut dan method dari superclass.
     *   Mendukung reusability dan hierarki terstruktur.
     *
     * Manfaat:
     *   - Mengurangi duplikasi kode (DRY principle).
     *   - Mempermudah pengembangan fitur baru.
     *
     * Analogi: ANAK mewarisi sifat ORANG TUA (golongan darah, nama
     *   keluarga) namun juga bisa punya kemampuan uniknya sendiri
     *   (bisa main piano padahal orang tua tidak bisa).
     *
     * 3. POLYMORPHISM
     * ---------------------------------------------------------------
     * Definisi: Satu method/objek berperilaku berbeda tergantung
     *   context atau tipe objek. Ada compile-time (overloading)
     *   dan runtime (overriding).
     *
     * Manfaat:
     *   - Kode lebih fleksibel dan mudah diperluas.
     *   - Mengurangi if-else yang panjang.
     *
     * Analogi: Tombol "VOLUME" di TV, HP, Radio — nama sama tapi
     *   cara kerja berbeda tiap perangkat. Satu interface, banyak perilaku.
     *
     * 4. ABSTRACTION
     * ---------------------------------------------------------------
     * Definisi: Menyembunyikan detail implementasi kompleks, menampilkan
     *   hanya fungsionalitas esensial via abstract class atau interface.
     *
     * Manfaat:
     *   - Memisahkan "apa yang dilakukan" dari "bagaimana dilakukan".
     *   - Perubahan implementasi tidak ganggu pengguna.
     *
     * Analogi: Mengendarai MOBIL — kita hanya tahu gas, rem, setir.
     *   Tidak perlu paham cara kerja mesin pembakaran atau sistem ABS.
     *
     * KETERKAITAN:
     *   Abstraction  → mendefinisikan kontrak
     *   Inheritance  → class baru mewarisi dan mengisi kontrak
     *   Encapsulation→ melindungi data di dalam setiap class
     *   Polymorphism → tiap class mengisi kontrak dengan caranya sendiri
     *   Hasil: sistem yang testable, extensible, maintainable, secure.
     */

    /*
     * ============================================================
     * SOAL ESSAY 2:
     * Kelebihan Java 21. Minimal dua fitur modern.
     * ============================================================
     *
     * FITUR 1: SEALED CLASSES (Java 17-21)
     * ---------------------------------------------------------------
     * Membatasi class mana saja yang boleh menjadi subclass.
     * Contoh: public sealed class Shape permits Circle, Rectangle, Triangle {}
     *
     * Manfaat OOP:
     *   - Hierarki class lebih aman dan terprediksi.
     *   - Mencegah extend sembarangan dari luar.
     *   - Bekerja dengan pattern matching switch yang exhaustive.
     *
     * FITUR 2: RECORD CLASSES (Java 16, mature Java 21)
     * ---------------------------------------------------------------
     * Cara singkat buat class immutable data carrier. Java otomatis
     * generate: constructor, getter, equals(), hashCode(), toString().
     * Contoh: public record Mahasiswa(String nim, String nama, double ipk) {}
     *
     * Manfaat OOP:
     *   - Boilerplate berkurang drastis (dari 50+ baris jadi 1 baris).
     *   - Objek immutable otomatis (Value Object pattern).
     *   - Encapsulation built-in, kode lebih bersih dan readable.
     *
     * FITUR 3 (BONUS): PATTERN MATCHING FOR SWITCH (Java 21 stable)
     * ---------------------------------------------------------------
     * switch (obj) { case Integer i -> ...; case String s -> ...; }
     * Menggantikan instanceof + cast yang panjang. Polymorphism lebih elegan.
     */

    /*
     * ============================================================
     * SOAL ESSAY 3:
     * Perbedaan class dan object. Contoh manajemen mahasiswa.
     * ============================================================
     *
     * CLASS  = Blueprint/cetakan. Definisi struktur & perilaku.
     *          Tidak ada di memori heap. Satu definisi.
     *          Analogi: RESEP MASAKAN (bukan makanannya).
     *
     * OBJECT = Instansi nyata dari class. Dibuat dengan 'new'.
     *          Ada di memori heap. Memiliki nilai nyata.
     *          Dari 1 class bisa buat banyak object.
     *          Analogi: MAKANAN JADI yang dimasak dari resep.
     *
     * CONTOH MANAJEMEN MAHASISWA:
     *
     *   // === DEFINISI CLASS (blueprint) ===
     *   class Mahasiswa {
     *       private String nim;
     *       private String nama;
     *       private String jurusan;
     *       private double ipk;
     *
     *       public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
     *           this.nim = nim; this.nama = nama;
     *           this.jurusan = jurusan; this.ipk = ipk;
     *       }
     *
     *       public void tampilInfo() {
     *           System.out.println("NIM: "+nim+" | Nama: "+nama
     *                            +" | Jurusan: "+jurusan+" | IPK: "+ipk);
     *       }
     *   }
     *
     *   // === PEMBUATAN OBJECT (instansi nyata) ===
     *   Mahasiswa mhs1 = new Mahasiswa("2301001", "Budi", "Informatika", 3.75);
     *   Mahasiswa mhs2 = new Mahasiswa("2301002", "Sari", "Matematika",  3.90);
     *   Mahasiswa mhs3 = new Mahasiswa("2301003", "Agus", "Fisika",      3.50);
     *
     *   mhs1.tampilInfo(); // NIM: 2301001 | Nama: Budi | ...
     *   mhs2.tampilInfo(); // NIM: 2301002 | Nama: Sari | ...
     *
     * TABEL PERBEDAAN:
     *   Aspek     | CLASS                  | OBJECT
     *   ----------|------------------------|------------------------
     *   Definisi  | Blueprint/cetakan      | Instansi nyata
     *   Jumlah    | Satu definisi          | Bisa banyak
     *   Memori    | Tidak di heap          | Ada di heap
     *   Keyword   | class Mahasiswa { }    | new Mahasiswa(...)
     */

    /*
     * ============================================================
     * SOAL ESSAY 4:
     * BankAccount dengan encapsulation. Mengapa penting?
     * ============================================================
     *
     *   public class BankAccount {
     *       private String accountNumber; // PRIVATE — tidak bisa akses langsung
     *       private String ownerName;
     *       private double balance;       // Terlindungi!
     *       private String pin;
     *
     *       public BankAccount(String accountNumber, String ownerName,
     *                          double initialDeposit, String pin) {
     *           this.accountNumber = accountNumber;
     *           this.ownerName = ownerName;
     *           this.balance = initialDeposit;
     *           this.pin = pin;
     *       }
     *
     *       public double getBalance()   { return balance; }   // GETTER saja
     *       public String getOwnerName() { return ownerName; } // Tidak ada setBalance()!
     *
     *       public void deposit(double amount) {
     *           if (amount <= 0) { System.out.println("Jumlah harus positif!"); return; }
     *           balance += amount;
     *           System.out.println("Deposit OK. Saldo: " + balance);
     *       }
     *
     *       public void withdraw(double amount, String inputPin) {
     *           if (!this.pin.equals(inputPin)) { System.out.println("PIN salah!"); return; }
     *           if (amount > balance) { System.out.println("Saldo tidak cukup!"); return; }
     *           balance -= amount;
     *           System.out.println("Tarik OK. Saldo: " + balance);
     *       }
     *   }
     *
     * MENGAPA PENTING UNTUK KEAMANAN:
     *   1. Cegah manipulasi langsung: account.balance = -999999; TIDAK BISA.
     *   2. Validasi terpusat: semua cek saldo & PIN di satu tempat, tak bisa bypass.
     *   3. Kontrol berlapis: withdraw() perlu PIN benar dulu.
     *   4. Audit terjamin: log transaksi bisa ditambah di dalam method.
     *   5. Aturan bisnis terjaga: saldo tidak bisa negatif secara paksa.
     */

    /*
     * ============================================================
     * SOAL ESSAY 5:
     * Constructor chaining. Ilustrasi Karyawan & Manager.
     * ============================================================
     *
     * Constructor chaining: constructor subclass memanggil constructor
     * superclass via super() — HARUS jadi baris PERTAMA.
     *
     * JIKA super() TIDAK DIPANGGIL EKSPLISIT:
     *   Java otomatis sisipkan super() tanpa argumen.
     *   Jika superclass tidak punya no-arg constructor → COMPILE ERROR.
     *
     * ILUSTRASI:
     *
     *   class Karyawan {
     *       private String nama;
     *       private String nip;
     *       private double gajiPokok;
     *
     *       public Karyawan(String nama, String nip, double gajiPokok) {
     *           System.out.println("[Karyawan] Constructor dipanggil");
     *           this.nama = nama; this.nip = nip; this.gajiPokok = gajiPokok;
     *       }
     *
     *       public void tampilInfo() {
     *           System.out.println("Nama: "+nama+" | NIP: "+nip+" | Gaji: "+gajiPokok);
     *       }
     *   }
     *
     *   class Manager extends Karyawan {
     *       private String departemen;
     *       private double tunjangan;
     *
     *       public Manager(String nama, String nip, double gajiPokok,
     *                      String departemen, double tunjangan) {
     *           super(nama, nip, gajiPokok); // BARIS PERTAMA — chaining ke Karyawan!
     *           System.out.println("[Manager] Constructor dipanggil");
     *           this.departemen = departemen;
     *           this.tunjangan  = tunjangan;
     *       }
     *
     *       @Override
     *       public void tampilInfo() {
     *           super.tampilInfo(); // panggil method parent
     *           System.out.println("Dept: "+departemen+" | Tunjangan: "+tunjangan);
     *       }
     *   }
     *
     *   // HASIL:
     *   Manager m = new Manager("Andi", "M001", 8000000, "IT", 2000000);
     *   // [Karyawan] Constructor dipanggil  ← super() dieksekusi DULU
     *   // [Manager] Constructor dipanggil   ← baru Manager
     *
     * URUTAN EKSEKUSI:
     *   new Manager() → super() → Karyawan selesai → sisa Manager → siap
     */

    /*
     * ============================================================
     * SOAL ESSAY 6:
     * Interface mendukung polymorphism. Contoh pemesanan makanan.
     * ============================================================
     *
     * Interface mendefinisikan "kontrak" — method WAJIB diimplementasi.
     * Banyak class berbeda bisa diperlakukan seragam via tipe interface
     * (runtime polymorphism). Satu class bisa implement banyak interface.
     *
     * CONTOH SISTEM PEMESANAN MAKANAN:
     *
     *   interface Orderable {
     *       String getNamaItem();
     *       double getHarga();
     *       String deskripsi();
     *   }
     *
     *   interface Discountable {
     *       double hitungDiskon();
     *   }
     *
     *   class NasiGoreng implements Orderable, Discountable {
     *       public String getNamaItem() { return "Nasi Goreng"; }
     *       public double getHarga()    { return 25000; }
     *       public String deskripsi()   { return "Nasi goreng spesial"; }
     *       public double hitungDiskon(){ return getHarga() * 0.10; } // 10%
     *   }
     *
     *   class EsTeh implements Orderable {
     *       public String getNamaItem() { return "Es Teh"; }
     *       public double getHarga()    { return 8000; }
     *       public String deskripsi()   { return "Es teh manis segar"; }
     *   }
     *
     *   // POLYMORPHISM — semua item diperlakukan sebagai Orderable
     *   List<Orderable> keranjang = new ArrayList<>();
     *   keranjang.add(new NasiGoreng());
     *   keranjang.add(new EsTeh());
     *
     *   double total = 0;
     *   for (Orderable item : keranjang) {
     *       System.out.println(item.getNamaItem() + ": Rp" + item.getHarga());
     *       total += item.getHarga();
     *       if (item instanceof Discountable d) {  // Pattern matching Java 16+
     *           System.out.println("Diskon: Rp" + d.hitungDiskon());
     *       }
     *   }
     *   System.out.println("Total: Rp" + total);
     *
     * Tambah class Dessert implements Orderable → kode loop TIDAK PERLU BERUBAH.
     * Itulah Open/Closed Principle dari polymorphism.
     */

    /*
     * ============================================================
     * SOAL ESSAY 7:
     * Bandingkan abstract class, interface, dan sealed class.
     * ============================================================
     *
     * ABSTRACT CLASS:
     *   Ciri  : Method konkret + abstract; punya field; single inheritance.
     *   Kapan : Ada kode konkret yang di-share antar subclass.
     *   Contoh: abstract class Hewan { void bernafas(){...} abstract void bersuara(); }
     *
     * INTERFACE:
     *   Ciri  : Default abstract; tanpa instance field; multiple implement.
     *   Kapan : Kemampuan/kontrak lintas hierarki class.
     *   Contoh: interface Printable { void print(); }
     *           Berbagai class tak berkaitan bisa sama-sama Printable.
     *
     * SEALED CLASS (Java 17+):
     *   Ciri  : Batasi subclass via permits; subclass harus final/sealed/non-sealed.
     *   Kapan : Hierarki tertutup dan terprediksi.
     *   Contoh: sealed class Shape permits Circle, Rectangle, Triangle {}
     *           Tidak ada class lain yang boleh extend Shape.
     *
     * TABEL PERBANDINGAN:
     *   Aspek           | Abstract Class | Interface   | Sealed Class
     *   ----------------|----------------|-------------|-------------
     *   Method konkret  | Ya             | Ya(default) | Ya
     *   Instance field  | Ya             | Tidak       | Ya
     *   Multi-inherit   | Tidak          | Ya          | Tidak
     *   Batasi subclass | Tidak          | Tidak       | Ya (permits)
     *   Constructor     | Ya             | Tidak       | Ya
     *   Kasus utama     | Kode shared    | Kontrak     | Hierarki tertutup
     *
     * KESIMPULAN:
     *   - Abstract Class : ada kode konkret yang di-share.
     *   - Interface      : kemampuan lintas hierarki class.
     *   - Sealed Class   : kepastian siapa saja turunannya.
     *   Ketiganya SALING MELENGKAPI, tidak saling menggantikan.
     */
}