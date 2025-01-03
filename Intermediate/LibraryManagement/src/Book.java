public class Book {

  private String bookName;
  private String author;
  private String bookId;
  private boolean isAvailable;

  public Book(String bookId, String author, String bookName) {
    this.bookName = bookName;
    this.bookId = bookId;
    this.author = author;
    this.isAvailable = true;
  }

  public String getBookId() {
    return bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailability(boolean value) {
    isAvailable = value;
  }

  @Override
  public String toString() {
    return "Book ID: " + bookId + ", Title: " + bookName + ", Author: " + author + ", Available: " + isAvailable;
  }

}
