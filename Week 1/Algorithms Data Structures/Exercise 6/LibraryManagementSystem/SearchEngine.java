import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {
    
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;
        String searchTitle = title.toLowerCase();

        while (left <= right) {
            int mid = (left + right) / 2;
            String midTitle = books[mid].title.toLowerCase();

            int compare = searchTitle.compareTo(midTitle);

            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
    }
}
