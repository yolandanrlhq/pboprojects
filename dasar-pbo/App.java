public class App {
    
    public static void main(String[] args) {
        
        //instansiasi object
        Dosen dosen1 = new Dosen();
        dosen1.nidn = "00240890";
        dosen1.nama = "Fulan";
        dosen1.mengampuMataKuliah();
        dosen1.memberiNilai();

        Dosen dosen2 = new Dosen();
        dosen2.nidn = "00181194";
        dosen2.nama = "Fulanah";
        dosen2.mengampuMataKuliah();
        dosen2.memberiNilai();
    }

}
