package ocp;

public class Main {
    public static void main(String[] args) {
        PembayaranCustomer pembayaranCustomer = new PembayaranCustomer();

        TipePembayaran cash = new Cash();
        TipePembayaran kredit = new Kredit();
        TipePembayaran debit = new Debit();
        
        pembayaranCustomer.menerimaPembayaran(cash);        
        pembayaranCustomer.menerimaPembayaran(kredit);        
        pembayaranCustomer.menerimaPembayaran(debit);
    }
}
