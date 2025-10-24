public class primitive {
    static void ubahNilai(int x) {
        x = x + 10;
        System.out.println("Nilai di dalam method: " + x);
    }

    public static void main(String[] args) {
        int angka = 5;
        ubahNilai(angka);
        System.out.println("Nilai di luar method: " + angka);
    }
}
