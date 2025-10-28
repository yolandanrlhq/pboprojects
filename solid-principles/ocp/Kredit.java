package ocp;

public class Kredit implements TipePembayaran {

    @Override
    public void memprosesPembayaran() {
        System.out.println("Memproses pembayaran dengan kreit");
    }
}
