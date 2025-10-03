import java.util.HashMap;

public class WarnaMap {
    public static void main(String[] args) {
        // Membuat HashMap dengan key = nama warna, value = kode hex
        HashMap<String, String> kodeWarna = new HashMap<>();

        // Menambahkan data
        kodeWarna.put("Merah", "#FF0000");
        kodeWarna.put("Hijau", "#00FF00");
        kodeWarna.put("Biru", "#0000FF");

        // Menampilkan semua data
        System.out.println("Daftar Kode Warna:");
        for (String nama : kodeWarna.keySet()) {
            System.out.println(nama + " = " + kodeWarna.get(nama));
        }

        // Mengambil data berdasarkan key
        System.out.println("\nKode warna untuk Hijau adalah: " + kodeWarna.get("Hijau"));

        // Menghapus data
        kodeWarna.remove("Biru");

        // Menampilkan setelah penghapusan
        System.out.println("\nSetelah warna Biru dihapus:");
        for (String nama : kodeWarna.keySet()) {
            System.out.println(nama + " = " + kodeWarna.get(nama));
        }
    }
}
