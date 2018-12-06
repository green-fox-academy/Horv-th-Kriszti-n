package bookstore;

public class Books {
  String title;
  String author;
  int releaseYear;
  int pageNumber;
  int weight;

  Books(String title, String author, int releaseYear, int pageNumber){
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.pageNumber = pageNumber;
    this.weight = pageNumber * 10;
  }

  public String bookInfo(){
    return "title: " + this.title + "author: " + this.author + "released: " + this.releaseYear;
  }




}
