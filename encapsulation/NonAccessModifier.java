class Siswi {
    static String universitas = "Universitas Indonesia";
    final String nim;

    public Siswi(String nim) {
        this.nim = nim;
    }

    public final void tampilkanData() {
        System.out.println("NIM : " + nim);
        System.out.println("Universitas : " + universitas);
    }
}

public class NonAccessModifier {
    public static void main(String[] args) {
        Siswi mhs1 = new Siswi("12345");
        Siswi mhs2 = new Siswi("67890");

        mhs1.tampilkanData();
        mhs2.tampilkanData();

        System.out.println("Universitas (akses lewat class) : " + Siswi.universitas);
    }
}
