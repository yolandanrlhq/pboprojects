// Superclass
class Pegawai {
    void tampilkanInfo() {
        System.out.println("Ini adalah seorang pegawai.");
    }
}

// Subclass
class Manager extends Pegawai {
    @Override
    void tampilkanInfo() {
        System.out.println("Ini adalah seorang manager, memiliki tugas mengatur tim.");
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Manager();  // Polymorphism

        p1.tampilkanInfo();  // Panggil method dari superclass
        p2.tampilkanInfo();  // Override: panggil method dari subclass
    }
}
