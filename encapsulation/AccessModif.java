class Siswa {
    public String nama;     // public → bisa diakses dari luar class
    private int umur;       // private → hanya bisa diakses dalam class ini

    // constructor
    public Siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // public method untuk menampilkan umur (karena umur itu private)
    public int getUmur() {
        return umur;
    }

    // public method untuk mengubah umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}

public class AccessModif {
    public static void main(String[] args) {
        Siswa mhs = new Siswa("Budi", 20);

        // public → bisa langsung diakses
        System.out.println("Nama (public): " + mhs.nama);

        // private → TIDAK bisa langsung diakses (akan error)
        // System.out.println("Umur (private): " + mhs.umur);

        // tapi kita bisa akses lewat method public (getter & setter)
        System.out.println("Umur (via getter): " + mhs.getUmur());

        // ubah umur dengan setter
        mhs.setUmur(21);
        System.out.println("Umur setelah diubah (via setter): " + mhs.getUmur());
    }
}
