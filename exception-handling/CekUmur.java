public class CekUmur {

    // method dengan throws
    public static void cekUmur(int umur) throws Exception {
        if (umur < 0) {
            // kalau umur tidak valid, lempar error
            throw new Exception("Umur tidak boleh negatif!");
        }
        System.out.println("Umur valid: " + umur + " tahun");
    }

    public static void main(String[] args) {
        try {
            cekUmur(20);   // valid
            cekUmur(-5);   // akan error

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());

        } finally {
            System.out.println("Pengecekan umur selesai (blok finally).");
        }
    }
}
