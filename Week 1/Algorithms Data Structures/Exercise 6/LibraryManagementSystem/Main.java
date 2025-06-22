public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Notebook", "Nicholas Sparks"),
                new Book(2, "Harry Potter", "J.K. Rowling"),
                new Book(3, "White Nights", "Fyodor Dostoevsky"),
                new Book(4, "Ikigai", "Francesc Miralles")
        };


        System.out.println("Linear Search for 'Harry Potter':");
        Book result1 = SearchEngine.linearSearch(books, "Harry Potter");
        System.out.println(result1 != null ? result1 : "Book not found");

        System.out.println("\nSorting books for binary search...");
        SearchEngine.sortBooksByTitle(books);

        System.out.println("Binary Search for 'White Nights':");
        Book result2 = SearchEngine.binarySearch(books, "White Nights");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
