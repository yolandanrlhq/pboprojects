package dependency;

public class Penyerang {
    String nama;
    
    Penyerang (String nama) {
    this.nama = nama;
    }

    void menendangBola(Bola bola) {
        System.out.println(this.nama + " menendang bola merk " + bola.getMerk());
    }

    Bola menerimaBola(Bola bola) {
        return bola;
    }

}