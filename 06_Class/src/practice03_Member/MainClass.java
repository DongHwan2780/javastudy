package practice03_Member;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // 임의 멤버 1명 만들고 정보 출력
    Address address = new Address("111-111", "인천", "남동구", "서창동", "아파트", true);
    Contact contact = new Contact("032", "010");
    Member member1 = new Member("동환", contact, address);    
    
    member1.allInfo();
  }

}
