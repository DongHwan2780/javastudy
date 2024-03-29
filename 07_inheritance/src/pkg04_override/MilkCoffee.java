package pkg04_override;


// 메소드 오버라이드
// 1. 자식 클래스가 부모 클래스의 메소드를 다시 만드는 것
// 2. @Override annotation을 추가한다
// 3. 똑같이(반환타입, 메소드명, 매개변수) 만들어야 한다

public class MilkCoffee extends BlackCoffee
{
  @Override   // 오버라이드한 메소드라고 JVM에게 알려준다.(부가적으로 다른 개발자에게도) 
  public void color()
  {
    System.out.println("커피색");
  }
}
