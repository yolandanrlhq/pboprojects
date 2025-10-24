package dependency;

public class Main {
    public static void main(String[] args) {

        Penyerang penyerang1 = new Penyerang("Cristiano Ronaldo");

        Bola bola1 = new Bola("Adidas"); 
        Bola bola2 = new Bola("Puma");

        penyerang1.menendangBola(bola1);
        System.out.println(penyerang1.nama + " menerima bola merk " + penyerang1.menerimaBola(bola2).getMerk());
    }
    
}