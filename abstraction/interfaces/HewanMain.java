package interfaces;

public class HewanMain {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.makan();
        kucing1.bersuara();
        kucing1.bersura("Ikan pindang.");

        Kambing kambing1 = new Kambing();
        kambing1.makan();
        kambing1.bersuara();
        kambing1.bersura("Rumput.");

        // //Casting
        // Hewan hewan1 = new Kucing();
        // Hewan hewan2 = new Kambing();
    }
    
}
