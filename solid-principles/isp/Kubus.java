package isp;

public class Kubus implements Shape2Dimension, Shape3Dimension {
    @Override
    public void calculateArea() {
        System.out.println("Menghitung luas kubus");
    }

    @Override
    public void calculateVolume() {
       System.out.println("Menghitung volume kubus");
    }
}
