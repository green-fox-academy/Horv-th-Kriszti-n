package bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

  List<Books> listOfBooks;

  BookStore() {
    this.listOfBooks = new ArrayList<>();
  }

  public void add(Books books) {
    listOfBooks.add(books);
  }

  public String getLightestBook() {
    int weight = this.listOfBooks.get(0).weight;
    String title = this.listOfBooks.get(0).title;
    for (int i = 0; i < listOfBooks.size(); i++) {
      if (weight > this.listOfBooks.get(i).weight) {
        weight = this.listOfBooks.get(i).weight;
        title = this.listOfBooks.get(i).title;
      }
    }
    return title;
  }

  public String getLongestBookAuthor() {
    int pageNumber = this.listOfBooks.get(0).pageNumber;
    String author = this.listOfBooks.get(0).author;
    for (int i = 0; i < this.listOfBooks.size() ; i++) {
      if (pageNumber > this.listOfBooks.get(i).pageNumber){
        pageNumber = this.listOfBooks.get(i).pageNumber;
        author = this.listOfBooks.get(i).author;
      }
    }
    return author;
  }
}
