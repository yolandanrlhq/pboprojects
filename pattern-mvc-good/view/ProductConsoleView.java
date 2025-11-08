package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Product;

public class ProductConsoleView {
    private final Scanner scanner;

    public ProductConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayProducts(ArrayList<Product> products) {
        System.out.println("--- Daftar Produk ---");
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk tersedia.");
        } else {
            for (Product product : products) {
            System.out.println(product.getId() + " - " + product.getName()
            + " Rp " +  product.getPrice());
            }
        }
    }

    public String getProductNameFromUser() {
        System.out.print("Masukkan Nama Produk: ");
        return scanner.nextLine();
    }

    public String getProductPriceFromUser() {
        System.out.print("Masukkan Harga Produk: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println("INFO: " + message);
    }

    public void displayError(String errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }
}