package bookstore;

public class HardCoverBook extends Books {

  HardCoverBook(String title, String author, int releaseYear, int pageNumber) {
    super(title, author, releaseYear, pageNumber);
    weight = weight + 100;
  }
}
