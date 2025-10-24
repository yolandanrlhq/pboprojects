// Abstract class
abstract class Pembayaran {
    double jumlah;

    Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    // Abstract method
    abstract void prosesPembayaran();

    // Concrete method
    void info() {
        System.out.println("\nTotal yang harus dibayar: Rp" + jumlah);
    }
}

// Subclass 1
class Cash extends Pembayaran {
    Cash(double jumlah) {
        super(jumlah);
    }

    @Override
    void prosesPembayaran() {
        System.out.println("Pembayaran tunai sebesar Rp" + jumlah + " berhasil dilakukan.");
    }
}

// Subclass 2
class Transfer extends Pembayaran {
    Transfer(double jumlah) {
        super(jumlah);
    }

    @Override
    void prosesPembayaran() {
        System.out.println("Pembayaran transfer sebesar Rp" + jumlah + " berhasil dilakukan.");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        Pembayaran p1 = new Cash(50000);
        Pembayaran p2 = new Transfer(100000);

        p1.info();
        p1.prosesPembayaran();

        p2.info();
        p2.prosesPembayaran();
    }
}
