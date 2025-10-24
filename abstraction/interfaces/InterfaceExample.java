// Interface
interface Pengiriman {
    void kirimPaket(String alamat);
}

// Implementasi dengan motor
class KurirMotor implements Pengiriman {
    public void kirimPaket(String alamat) {
        System.out.println("Mengirim paket via Motor ke " + alamat + ".");
    }
}

// Implementasi dengan mobil
class KurirMobil implements Pengiriman {
    public void kirimPaket(String alamat) {
        System.out.println("Mengirim paket via Mobil ke " + alamat + ".");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Pengiriman kurir1 = new KurirMotor();
        kurir1.kirimPaket("Jl. Merdeka No.10");

        Pengiriman kurir2 = new KurirMobil();
        kurir2.kirimPaket("Jl. Sudirman No.15");
    }
}
