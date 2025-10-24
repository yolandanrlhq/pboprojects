package abstractclass;

public abstract class Hewan {

    public abstract void makan();
    public abstract void bersuara();
    public abstract void bersuara(String makanan);

    public void showInfo() {
        System.out.println("Ini adalah turunan objek hewan");
    }
    
}