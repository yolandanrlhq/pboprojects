// Parent class
class Hewan {
    public void makan() {
        System.out.println("Hewan sedang makan");
    }
}

// Interface
interface Terbang {
    void terbang();
}

// Child class dari Hewan + implements Terbang
class Burung extends Hewan implements Terbang {
    String nama; // <-- property

    // Constructor
    public Burung(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println(nama + " berkicau");
    }

    public void terbang() {
        System.out.println(nama + " bisa terbang di langit");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Burung b = new Burung("Kenari");
        b.makan();   // dari Hewan
        b.suara();   // dari Burung
        b.terbang(); // dari interface Terbang
    }
}