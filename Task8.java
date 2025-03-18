import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equals(name));
    }

    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice() + " - " + p.getQuantity() + " pcs");
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("Apple", 1.5, 50));
        store.addProduct(new Product("Milk", 2.0, 30));
        store.addProduct(new Product("Bread", 1.2, 20));

        System.out.println("Available Products:");
        store.displayProducts();

        System.out.println("Removing 'Milk'...");
        store.removeProduct("Milk");

        System.out.println("Updated Products:");
        store.displayProducts();
    }
}
