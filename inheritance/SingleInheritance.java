// Parent class
class Animal {
    String nama;

    public Animal(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan...");
    }
}

// Child class
class Kucing extends Animal {
    public Kucing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " mengeong : Meoww!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing("Kitty");
        k.makan();   // method dari parent
        k.suara();   // method dari child
    }
}
