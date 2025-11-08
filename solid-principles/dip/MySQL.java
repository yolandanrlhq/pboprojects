package dip;

public class MySQL implements Database {
    @Override
    public void insert(String data) {
        System.out.println("insert data ke database MySQL: " + data);
    }   
}