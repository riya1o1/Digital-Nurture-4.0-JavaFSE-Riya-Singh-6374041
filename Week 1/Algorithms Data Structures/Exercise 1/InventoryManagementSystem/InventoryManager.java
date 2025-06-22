import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(int id, String name, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product product = inventory.get(id);
            product.productName = name;
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product ID not found.");
        }
    }

    public void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product with ID " + id + " deleted.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}

