package dip;

public class PostgreSQL implements Database {
    @Override
    public void insert(String data) {
        System.out.println("insert data ke database PostgreSQL: " + data);
    }    
}