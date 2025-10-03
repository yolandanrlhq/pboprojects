import java.util.ArrayList;

public class Warna {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan warna
        ArrayList<String> daftarWarna = new ArrayList<>();

        // Menambahkan data warna
        daftarWarna.add("Merah");
        daftarWarna.add("Biru");
        daftarWarna.add("Hijau");

        // Menampilkan semua warna
        System.out.println("Daftar Warna:");
        for (String w : daftarWarna) {
            System.out.println("- " + w);
        }

        // Menghapus satu warna
        daftarWarna.remove("Biru");

        // Menampilkan daftar warna setelah dihapus
        System.out.println("\nSetelah warna Biru dihapus:");
        for (String w : daftarWarna) {
            System.out.println("- " + w);
        }
    }
}
