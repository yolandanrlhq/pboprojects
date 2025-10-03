public class Mobil {
    private String merk;

    public Mobil (String merk) {
        this.merk = merk;
    }
    
    public void melaju() {
        System.out.println("Mobil " + this.merk + " melaju");
    }
} 