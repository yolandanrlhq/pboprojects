// Interface Terbang
interface Terbang {
    void terbang();  // otomatis public abstract
}

// Interface Berenang
interface Berenang {
    void berenang(); // otomatis public abstract
}

// Class Bebek implement dua interface
class Bebek implements Terbang, Berenang {
    private String nama;   // property sebaiknya private (encapsulation)

    // Constructor
    public Bebek(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public void terbang() {
        System.out.println(nama + " bisa terbang rendah");
    }

    public void berenang() {
        System.out.println(nama + " juga bisa berenang");
    }
}

// Class utama
public class MultipleInheritance {
    public static void main(String[] args) {
        Bebek bebek1 = new Bebek("Donald Bebek");

        System.out.println("Nama : " + bebek1.getNama());
        bebek1.terbang();
        bebek1.berenang();
    }
}