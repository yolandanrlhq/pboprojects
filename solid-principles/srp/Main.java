package srp;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(8);
        PenghitungPersegi penghitung = new PenghitungPersegi();

        // cara lain :
        // System.out.println("Luas Persegi: " + penghitung.hitungLuas(persegi) + "cm");
        int luas = penghitung.hitungLuas(persegi);
        System.out.println("Luas Persegi: " + luas + "cm");
    }
    
}
