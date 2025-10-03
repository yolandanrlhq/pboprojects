public class AkunBank {
    //propery
    private int saldo;

    //method konstruktor
    public AkunBank(int saldo) { //mengacu ke parameter
        this.saldo = saldo; //mengacu ke property karena ada this
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public String menabung(int saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            return "Menabung berhasil";
        } else {
            return "Menabung gagal";
        }
    }

    public void tarikTunai(int jumlah) {
    while (true) {
        if (jumlah > 0 && this.saldo - jumlah >= 10) {
            this.saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. ");
            break; // keluar loop kalau berhasil
        } else {
            System.out.println("Tarik tunai gagal!");
            break; // kalau mau user coba lagi, hapus 'break' ini
        }
    }
}
}