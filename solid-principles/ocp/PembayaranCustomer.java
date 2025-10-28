package ocp;

public class PembayaranCustomer {
    public void menerimaPembayaran(TipePembayaran tipe) {
        System.out.println("Menerima pembayaran customer");
        tipe.memprosesPembayaran();
    }
}