// package interfaces;

// public class Kambing implements Hewan {
//     public void makan() {
//         System.out.println("Kambing makan rumput.");
//     }

//     public void bersuara() {
//         System.out.println("Kambing berkata: Meeh Meeh\n");
//     }
// }

package interfaces; 

public class Kambing implements Hewan {

    @Override
    public void makan() {
        System.out.println("Kambing makan rumput.");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Mbeeee!!");
    }

    @Override
    public void bersura(String makanan) {
        System.out.println("Mbeee makan " + makanan);
    }
}