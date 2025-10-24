public class ArrayMain {

    public static void main(String[] args) {
        /* Tanpa Array */
        // String nama1 = "Viola";
        // String nama2 = "Kusti";
        // String nama3 = "Azkia";

        // System.out.println(nama1);
        // System.out.println(nama2);
        // System.out.println(nama3);

        /* Deklarasi Array cara 1 */
        String[] daftarNama = {"Viola", "Kusti", "Azkia"};
        // System.out.println(daftarNama[1]);
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        /* Deklarasi Array cara 2 */
        String[] dataNama = new String[3];
        dataNama[0] = "Viola";
        dataNama[1] = "Kusti";      
        dataNama[2] = "Azkia";
        for (String nama : dataNama) {
            System.out.println(nama);
        }
    }

}