import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library {

  private List<Member> members;
  private List<Book> books;
  private List<Transaction> records;

  private Random rand = new Random();

  public Library() {
    this.members = new ArrayList<>();
    this.books = new ArrayList<>();
    this.records = new ArrayList<>();
  }

  public void addBook(String bookName, String author) {
    String bookId = String.format("%04d", rand.nextInt(10000));
    books.add(new Book(bookId, author, bookName));
  }

  public void addMember(String memberName) {
    String id = String.format("%04d", rand.nextInt(1000));
    members.add(new Member(memberName, id));
  }

  public void borrowBook(String bookName, String memberName) {
    try {
      Book bookToBorrow = books.stream().filter(book -> bookName.equalsIgnoreCase(book.getBookName())).findAny()
          .orElse(null);
      Member borrowingMember = members.stream().filter(member -> memberName.equalsIgnoreCase(member.getMemberName()))
          .findAny().orElse(null);
      if (bookToBorrow != null && borrowingMember != null && bookToBorrow.isAvailable()) {
        bookToBorrow.setAvailability(false);
        addTransaction(bookToBorrow, borrowingMember, "Borrow");
        System.out.println("You have borrowed the book " + bookToBorrow.getBookName());
      } else {
        System.out.println("This book has already been borrowed. Wait for it to be returned.");
      }

    } catch (Exception e) {
      System.err.println("An error occurred while borrowing." + e.getMessage());
    }
  }

  public void returnBook(String bookName, String memberName) {
    try {
      Book bookToReturn = books.stream().filter(book -> bookName.equalsIgnoreCase(book.getBookName())).findAny()
          .orElse(null);
      Member returningMember = members.stream().filter(member -> memberName.equalsIgnoreCase(member.getMemberName()))
          .findAny().orElse(null);

      if (bookToReturn != null && !bookToReturn.isAvailable()) {
        bookToReturn.setAvailability(true);
        addTransaction(bookToReturn, returningMember, "Return");
        System.out.println("You have returned this book. Thank you for reading!");
      } else {
        System.out.println("Oh this book isn't even borrowed yet.");
      }

    } catch (Exception e) {
      System.err.println("Problem occurred in returning book." + e.getMessage());
    }
  }

  public void addTransaction(Book book, Member member, String type) {
    String id = String.format("%04d", rand.nextInt(10000));
    records.add(new Transaction(book, member, id, LocalDateTime.now(), type));
  }

  public void displayAllBooks() {
    System.out.println("All books in the library:");
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }

  public void displayAllMembers() {
    System.out.println("All members of the library:");
    for (Member member : members) {
      System.out.println(member.toString());
    }
  }

  public void displayAllTransaction() {
    System.out.println("All transactions issued: ");
    for (Transaction record : records) {
      System.out.println(record.toString());
    }
  }

}
