// Kelas utama untuk aplikasi restoran
public class RestoranApp {
    public static void main(String[] args) {
        // Membuat objek makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 15000, "Makanan Berat");
        Makanan makanan2 = new Makanan("Ayam Bakar", 30000, "Makanan Berat");

        // Membuat objek minuman
        Minuman minuman1 = new Minuman("Es Teh", 5000, "Minuman Dingin");
        Minuman minuman2 = new Minuman("Jus Jeruk", 8000, "Minuman Dingin");

        // Membuat objek diskon
        Diskon diskon1 = new Diskon("Diskon Spesial", 0.1);

        // Menampilkan menu makanan dan minuman
        makanan1.tampilMenu();
        makanan2.tampilMenu();
        minuman1.tampilMenu();
        minuman2.tampilMenu();

        // Menampilkan menu dengan diskon
        diskon1.tampilMenu();
    }
}

// Kelas dasar untuk item menu
class MenuItem {
    protected String nama;
    protected double harga;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi menu
    public void tampilMenu() {
        System.out.println(nama + " - Rp" + harga);
    }
}

// Kelas Makanan sebagai subkelas dari MenuItem
class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga);
        this.jenisMakanan = jenisMakanan;
    }

    // Override metode tampilMenu untuk menampilkan informasi khusus makanan
    @Override
    public void tampilMenu() {
        System.out.println(nama + " (" + jenisMakanan + ") - Rp" + harga);
    }
}

// Kelas Minuman sebagai subkelas dari MenuItem
class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String nama, double harga, String jenisMinuman) {
        super(nama, harga);
        this.jenisMinuman = jenisMinuman;
    }

    // Override metode tampilMenu untuk menampilkan informasi khusus minuman
    @Override
    public void tampilMenu() {
        System.out.println(nama + " (" + jenisMinuman + ") - Rp" + harga);
    }
}

// Kelas Diskon sebagai subkelas dari MenuItem
class Diskon extends MenuItem {
    private double diskon;

    public Diskon(String nama, double diskon) {
        super(nama, 0); // Harga diskon diatur ke 0 karena ini bukan item yang dijual
        this.diskon = diskon;
    }

    // Override metode tampilMenu untuk menampilkan informasi diskon
    @Override
    public void tampilMenu() {
        System.out.println(nama + " - Diskon " + (diskon * 100) + "%");
    }
}
