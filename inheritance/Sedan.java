public class Sedan {
    private String merk;

    public Sedan (String merk) {
        this.merk = merk;
    }
    
    public void melaju() {
        System.out.println("Sedan " + this.merk + " melaju");
    }
} 