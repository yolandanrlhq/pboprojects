// Parent class
class Bunga {
    String nama;

    public Bunga(String nama) {
        this.nama = nama;
    }

    public void mekar() {
        System.out.println(nama + " sedang mekar indah.");
    }
}

// Child class 1
class Mawar extends Bunga {
    public Mawar(String nama) {
        super(nama);
    }

    public void berduri() {
        System.out.println(nama + " memiliki duri di batangnya.");
    }
}

// Child class 2
class Melati extends Bunga {
    public Melati(String nama) {
        super(nama);
    }

    public void harum() {
        System.out.println(nama + " mengeluarkan aroma harum.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mawar m = new Mawar("Mawar Merah");
        Melati ml = new Melati("Melati Putih");

        m.mekar();
        m.berduri();

        ml.mekar();
        ml.harum();
    }
}