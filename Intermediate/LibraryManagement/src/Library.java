import java.util.List;
import java.util.Random;

public class Library {

  private List<Member> members;
  private List<Book> books;
  private List<Transaction> records;

  public void addBook(String bookName, String author, String bookId) {
    books.add(new Book(bookId, author, bookName));
  }

  public void addMember(String memberName) {
    Random rand = new Random();
    String id = String.format("%04d", rand.nextInt(1000));
    members.add(new Member(memberName, id));
  }

  public void deleteBook(String bookName) {
    try {
      Book bookToDelete = books.stream().filter(book -> bookName.equals(book.getBookName())).findAny().orElse(null);
      books.remove(bookToDelete);
    } catch (Exception e) {
      System.err.println("Book doesn't exist" + e.getMessage());
    }
  }

  public void borrowBook(String bookName) {
    try {
      Book bookToBorrow = books.stream().filter(book -> bookName.equals(book.getBookName())).findAny().orElse(null);
      if (bookToBorrow.isBorrowed) {
        System.out.println("This book has already been borrowed. Wait for it to be returned.");
      } else {
        bookToBorrow.isBorrowed = true;
        System.out.println("You have borrowed the book " + bookToBorrow.getBookName());
      }

    } catch (Exception e) {
      System.err.println("An error occurred while borrowing." + e.getMessage());
    }
  }

  public void returnBook(String bookName) {
    try {
      Book bookToReturn = books.stream().filter(book -> bookName.equals(book.getBookName())).findAny().orElse(null);
      if (bookToReturn.isBorrowed) {
        bookToReturn.isBorrowed = false;
        System.out.println("You have returned this book. Thank you for reading!");
      } else {
        System.out.println("Oh this book isn't even borrowed yet.");
      }

    } catch (Exception e) {
      System.err.println("Problem occurred in returning book." + e.getMessage());
    }
  }

  public void addTransaction(String bookName, String memberName) {

  }

}
