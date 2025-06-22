public class SearchEngine {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
     public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = products[mid].productName.toLowerCase();
            String searchName = name.toLowerCase();

            int compare = searchName.compareTo(midName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
}