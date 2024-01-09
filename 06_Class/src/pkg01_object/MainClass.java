package pkg01_object;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // 객체 선언
    
    Calculator cCal;
    
    
    // 객체 생성
    cCal = new Calculator();
    
    // 객체를 이용해서 클래스의 멤버(필드, 메소드)를 사용할 수 있다.
    // 객체.멤버
    
    cCal.number = 100;
    System.out.println(cCal.number);
    
    cCal.method();
  }

}
