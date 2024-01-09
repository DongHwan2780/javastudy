package pkg03_return;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Calculator calculator = new Calculator();
    
    System.out.println(calculator.method1());
    System.out.println(calculator.method1() == 10 ? "십이다" : "아니다");
    
    int a = calculator.method1();
    System.out.println(a);
    
    int[] arr = calculator.method2();
    for(int b : arr)
      System.out.println(b);
    
    for(int b : calculator.method2())
      System.out.println(b);

    System.out.println(calculator.method3().add(1,2,3));
    
  }

}
