import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {

  private Book book;
  private Member member;
  private String transactionId;
  private LocalDateTime date;
  private String type;

  public Transaction(Book book, Member member, String transactionId, LocalDateTime date, String type) {
    this.book = book;
    this.member = member;
    this.transactionId = transactionId;
    this.date = date;
    this.type = type;
  }

  public Book getBook() {
    return book;
  }

  public Member getMember() {
    return member;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Transaction Id: " + transactionId + ", Book: " + book.getBookName() + ", Member: " + member.getMemberName()
        + ", Date: " + date + "Type: " + type;
  }
}
