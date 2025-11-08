package controller;

import java.util.ArrayList;

import model.Product;
import view.ProductConsoleView;

public class ProductController {    
    private final ProductConsoleView view;
    private final ArrayList<Product> model = new ArrayList<>();
    
    public ProductController(ProductConsoleView view) {
        this.view = view;
        model.add(new Product(1, "Laptop ASUS", 9500000));
        model.add(new Product(2, "Monitor Dell", 2500000));        
    }

    public void handlingPilihMenu(int pilihMenu) {
        switch (pilihMenu) {
            case 1:
                displayProductsAction();
                break;
            case 2:
                addProductAction();
                break;
            case 3:
                view.displayMessage("Keluar dari aplikasi.");
                break;  
            default:
                view.displayError("Opsi tidak valid.");            
        }
    }

    private void displayProductsAction() {
        view.displayProducts(model);
    }

    private void addProductAction() {
        String name = view.getProductNameFromUser();
        String priceStr = view.getProductPriceFromUser();
        try {
            long price = Long.parseLong(priceStr);
            if (price <= 0) {
                throw new IllegalArgumentException(
                    "Harga harus angka positif lebih dari nol.");  
            }
            int newId = model.size() + 1;
            model.add(new Product(newId, name, price));            
            view.displayMessage("Produk berhasil ditambahkan!");
        } catch (NumberFormatException e) {
            view.displayError("Gagal menambah produk: " + e.getMessage());
        }
    }    
}
