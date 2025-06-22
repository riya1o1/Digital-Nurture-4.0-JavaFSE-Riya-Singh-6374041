import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search: ");
        Product found = SearchEngine.linearSearch(products, "Mobile");
        System.out.println(found != null ? found : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search:");
        Product found2 = SearchEngine.binarySearch(products, "Watch");
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}
