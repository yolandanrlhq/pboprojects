import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Viola");
        daftarNama.add("Kusti");
        daftarNama.add("Azkia");
        daftarNama.add("Evi");
        
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

    }
}
