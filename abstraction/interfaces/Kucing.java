// package interfaces;

// public class Kucing implements Hewan {
//     public void makan() {
//         System.out.println("Kucing makan ikan.");
//     }

//     public void bersuara() {
//         System.out.println("Kucing berkata : Meow Meow");
//     }
// }

package interfaces;

public class Kucing implements Hewan {

    @Override
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Meonggg!!");
    }

    @Override
    public void bersura(String makanan) {
        System.out.println("Meonggg makan " + makanan);
    }
}