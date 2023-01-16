package godofjavabook1.example.Reference;

public class ReferenceConstructor {
  public static void main(String[] args) {
    ReferenceConstructor reference = new ReferenceConstructor();
    reference.makeMemberObject();
  }

  public void makeMemberObject() {
    MemberDTO dto1 = new MemberDTO();
    MemberDTO dto2 = new MemberDTO("SangMin");
    MemberDTO dto3 = new MemberDTO("SangMin", "010-XXXX-XXXX");
    MemberDTO dto4 = new MemberDTO("SangMin", "010-XXXX-XXXX", "god@godofjava.com");
  }
}
