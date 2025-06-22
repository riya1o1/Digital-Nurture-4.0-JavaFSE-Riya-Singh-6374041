public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 2500),
            new Order(2, "Bob", 1500),
            new Order(3, "Charlie", 5000),
            new Order(4, "Daisy", 3000)
        };

        System.out.println("Original Orders:");
        Sorter.printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted using Bubble Sort:");
        Sorter.bubbleSort(orders);
        Sorter.printOrders(orders);

        // Resetting array
        orders = new Order[] {
            new Order(1, "Alice", 2500),
            new Order(2, "Bob", 1500),
            new Order(3, "Charlie", 5000),
            new Order(4, "Daisy", 3000)
        };

        // Quick Sort
        System.out.println("\nSorted using Quick Sort:");
        Sorter.quickSort(orders, 0, orders.length - 1);
        Sorter.printOrders(orders);
    }
}
