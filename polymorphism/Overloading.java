// Class Produk
class Produk {
    private String nama;

    // Constructor
    public Produk(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Overloading 1: tanpa parameter
    public void info() {
        System.out.println("Produk -> " + nama);
    }

    // Overloading 2: dengan 1 parameter (harga)
    public void info(double harga) {
        System.out.println("Produk : " + nama + ", Harga: Rp" + harga);
    }

    // Overloading 3: dengan 2 parameter (harga + stok)
    public void info(double harga, int stok) {
        System.out.println("Produk : " + nama + ", Harga: Rp" + harga +
                           ", Stok : " + stok + " unit" + "\n");
    }
}

// Main class
public class Overloading {
    public static void main(String[] args) {
        Produk laptop = new Produk("Laptop Gaming");
        Produk smartphone = new Produk("Smartphone 5G");

        // Polymorphism via overloading
        laptop.info();
        laptop.info(15000000);
        laptop.info(15000000, 5);

        smartphone.info();
        smartphone.info(7000000);
        smartphone.info(7000000, 10);
    }
}