package view;

import model.Buku;

public class BukuView {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku();
        buku1.judul = "PBO";
        buku1.penulis = "Yolanda";

        // Menampilkan informasi buku
        System.out.println("Judul Buku : " + buku1.judul);
        System.out.println("Penulis    : " + buku1.penulis);
    }
}
