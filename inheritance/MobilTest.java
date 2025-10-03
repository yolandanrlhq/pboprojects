public class MobilTest {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota");
        Sedan sedan1= new Sedan("BMW");
        Truck truck1 = new Truck("Isuzu");   
        mobil1.melaju();
        sedan1.melaju(); 
        truck1.melaju();
        System.out.println("Mobil, Sedan, dan Truck telah melaju.");
    }
}