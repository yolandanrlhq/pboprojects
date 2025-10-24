class Mahasiswa {
    String nama;
}

public class Dataobject {
    static void ubahNama(Mahasiswa m) {
        m.nama = "Budi"; 
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Andi";

        ubahNama(mhs);
        System.out.println("Nama di luar method: " + mhs.nama);
    }
}

