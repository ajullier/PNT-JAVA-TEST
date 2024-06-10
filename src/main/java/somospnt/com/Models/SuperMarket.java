package somospnt.com.Models;

import java.util.ArrayList;
import java.util.Collections;

public class SuperMarket {

    private static ArrayList<Product> loadProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Coca-Cola Zero", 20.00, (float) 1.5, "L"));
        products.add(new Product("Coca-Cola", 18.00, (float) 1.5, "L"));
        products.add(new Product("Shampoo Sedal", 19.00, 500, "ml"));
        products.add(new Product("Frutillas", 64.00));

        for (Product product : products) {
            System.out.println(product);
        }
        return products;
    }

    public static void showMessages() {
        ArrayList<Product> products = loadProducts();
        Collections.sort(products);

        System.out.println("=============================");
        Product expensive = products.get(products.size() - 1);
        Product cheaper = products.get(0);
        System.out.println("Producto más caro: " + expensive.getName());
        System.out.println("Producto más barato: " + cheaper.getName());
    }
}
