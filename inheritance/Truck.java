public class Truck {
    private String merk;

    public Truck (String merk) {
        this.merk = merk;
    }
    
    public void melaju() {
        System.out.println("Truck " + this.merk + " melaju");
    }
} 