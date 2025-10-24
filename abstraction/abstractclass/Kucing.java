package abstractclass;

public class Kucing extends Hewan {
    
    public void makan() {
        System.out.println("Kucing Makan Ikan");
    }

    public void bersuara() {
        System.out.println("Kucing bersuara Meongg");
    }

    public void bersuara(String makanan) {
        System.out.println("Kucing makan " + makanan);
    }
}