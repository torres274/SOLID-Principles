package single.responsibility;

// this principle states that a class should only have one responsibility.
public class BookPrinter {

    private final Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public void printBook() {
        System.out.printf("Name: %s%n", this.book.getName());
        System.out.printf("Author: %s%n", this.book.getAuthor());
        System.out.printf("Text: %s%n", this.book.getText());
    }
}
