package pkg10_static;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // 클래스 멤버 호출 : 클래스.멤버
    System.out.println(Calculator.maker);
    
    int num = Integer.parseInt("100");
    System.out.println(num);
    
    Calculator.add(1,2);
  }

}
