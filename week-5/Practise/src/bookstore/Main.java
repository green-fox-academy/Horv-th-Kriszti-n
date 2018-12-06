package bookstore;

public class Main {
  public static void main(String[] args) {
    Books book1 = new HardCoverBook("Infinity War", "Stan Lee", 2000, 130);
    Books book2 = new HardCoverBook("Harry Potter", "J. K. Rowling", 1999, 400);
    Books book3 = new HardCoverBook("Spider Man", "Stan Lee", 1985, 210);
    Books book4 = new HardCoverBook("The Walking Dead", "Robert Kirkman", 2012, 100);
    Books book5 = new PaperBackBook("Game of Thrones", "George R. Martin", 1990, 800);
    Books book6 = new PaperBackBook("Batman", "King Matyas", 1975, 150);
    Books book7 = new PaperBackBook("Superman", "Mahatma Gandhi", 1965, 1000);
    Books book8 = new PaperBackBook("Nightmare in the JAVA street", "Green Fox", 2018, 666);

    BookStore store = new BookStore();
    store.add(book1);
    store.add(book2);
    store.add(book3);
    store.add(book4);
    store.add(book5);
    store.add(book6);
    store.add(book7);
    store.add(book8);

    System.out.println("The lighest book of all time: " + store.getLightestBook());
    System.out.println("The longest book of all time was written by: " + store.getLongestBookAuthor());
  }
}
