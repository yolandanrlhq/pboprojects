// Parent
class Kendaraan {
    String merk;
    public Kendaraan(String merk) {
        this.merk = merk;
    }
    public void jalan() {
        System.out.println(merk + " sedang berjalan...");
    }
}

// Child dari Kendaraan
class Car extends Kendaraan {
    public Car(String merk) {
        super(merk);
    }
    public void klakson() {
        System.out.println(merk + " membunyikan klakson!");
    }
}

// Child dari Car
class CarSport extends Car {
    public CarSport(String merk) {
        super(merk);
    }
    public void turbo() {
        System.out.println(merk + " mengaktifkan turbo!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        CarSport ms = new CarSport("Lamborghini");
        ms.jalan();   // dari Kendaraan
        ms.klakson(); // dari Car
        ms.turbo();   // dari CarSport
    }
}