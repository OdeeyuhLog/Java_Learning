public class Member {

  private String memberName;
  private String memberId;

  public Member(String name, String id) {
    this.memberName = name;
    this.memberId = id;
  }

  public String getMemberName() {
    return memberName;
  }

  public String getMemberId() {
    return memberId;
  }

  @Override
  public String toString() {
    return "Member ID: " + memberId + ", Member Name: " + memberName;
  }
}
