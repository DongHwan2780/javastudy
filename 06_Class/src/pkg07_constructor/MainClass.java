package pkg07_constructor;

public class MainClass
{

  /*
   *  생성자
   *  1. constructor
   *  2. 객체를 생성할 때 동작하는 메소드
   *  3. new 키워드와 함께 사용된다.
   *  4. 특징
   *    1) 생성자는 클래스와 이름이 같다
   *    2) 객체(또는 클래스)를 이용해서 호출하지 않는다
   *    3) 반환의 개념 자체가 없다
   *    4) 매개변수(parameter) 처리는 일반 메소드와 동일하다 -> 생성자 오버로딩이 가능하다
   * 
   * */
  
  /*
   *  디폴트생성자
   *  1. 생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다.
   *  2. 매개변수가 없고 본문에 실행 코드가 없는 형식이다
   * 
   * */
  
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // Computer 객체 선언 및 생성
    //Computer computer1 = new Computer();
    
    //computer1.develop();
    //computer1.danggeun();
    //computer1.thistest();
    
    //Computer computer2 = new Computer("삼성", 300);
    //computer2.develop();
    //computer2.danggeun();
    
    Computer computer3 = new Computer("애플", 500, new Calculator());
    computer3.develop();
    computer3.danggeun();
    computer3.calculator.add(1,2,3);
    
    
  }

}