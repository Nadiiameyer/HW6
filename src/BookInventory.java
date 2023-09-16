import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookInventory {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Pineapple Street", "Jenny Jackson", "red", 15.99));
        bookList.add(new Book("Emily Henry", "Happy Place", "green", 12.50));
        bookList.add(new Book("House of Earth and Blood", "Sarah J. Maas", "blue", 20.00));
        bookList.add(new Book("If you could see the sun", "Ann Liang", "black", 8.75));
        bookList.add(new Book("The midnight library", "Matt Haig", "red", 18.50));

        Map<Integer, Book> bookMap = createBookMap(bookList);

        System.out.println("All books:");
        bookMap.values().forEach(System.out::println);

        String targetColor = "red";
        System.out.println("\nBooks with the color " + targetColor + ":");
        List<Book> booksWithColor = getBooksByColor(bookMap, targetColor);
        booksWithColor.forEach(System.out::println);

        double targetPrice = 15.00;
        System.out.println("\nBooks with the price more than " + targetPrice + ":");
        List<Book> booksWithPriceAbove = getBooksByPriceAbove(bookMap, targetPrice);
        booksWithPriceAbove.forEach(System.out::println);
    }

    public static Map<Integer, Book> createBookMap(List<Book> bookList) {
        return bookList.stream()
                .collect(Collectors.toMap(bookList::indexOf, book -> book));
    }

    public static List<Book> getBooksByColor(Map<Integer, Book> bookMap, String color) {
        return bookMap.values().stream()
                .filter(book -> book.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    public static List<Book> getBooksByPriceAbove(Map<Integer, Book> bookMap, double price) {
        return bookMap.values().stream()
                .filter(book -> book.getPrice() > price)
                .collect(Collectors.toList());
    }

}


