package ocp;

public class Cash implements TipePembayaran {

    @Override
    public void memprosesPembayaran() {
        System.out.println("Memproses pembayaran dengan cash");
    }
}
