public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(1, "Laptop", 10, 50000));
        manager.addProduct(new Product(2, "Mouse", 50, 500));

        manager.updateProduct(1, "Gaming Laptop", 8, 60000);

        manager.deleteProduct(2);

        manager.displayInventory();
    }
}
