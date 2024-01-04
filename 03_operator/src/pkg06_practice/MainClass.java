package pkg06_practice;

public class MainClass 
{
  public static void method1()
  {
    int second = 90;
    int m = second / 60;
    int s = second % 60;
    
    System.out.println(m);
    System.out.println(s);
  }
  
  public static void method2()
  {
    int x = 10;
    int y = 20;
    int temp;
    
    temp = x;
    x = y;
    y = temp;
    
    System.out.println(x);
    System.out.println(y);
  }
  
  public static void method3()
  {
    int score = 90;
    
    System.out.println(score >= 90);
  }
  
  public static void method4()
  {
    int n = 4;
    String s = "";
    
    s = (n % 2 == 0) ? "짝수" : "홀수";
    
    System.out.println(s);
  }
  
  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    method3();
    method4();
  
  }

}
