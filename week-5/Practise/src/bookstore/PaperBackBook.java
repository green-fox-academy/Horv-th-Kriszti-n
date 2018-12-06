package bookstore;

public class PaperBackBook extends Books {
  PaperBackBook(String title, String author, int releaseYear, int pageNumber) {
    super(title, author, releaseYear, pageNumber);
    weight = weight + 20;
  }
}
