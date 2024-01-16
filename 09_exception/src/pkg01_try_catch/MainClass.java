package pkg01_try_catch;

public class MainClass
{

  public static void method1()
  {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "123";
    int num = Integer.parseInt(userInput);
    System.out.println(num);
  }
  
  public static void method2()
  {
    // 예외 처리 : try _ catch
    try 
    {
      
      String userInput = "12.3";
      int num = Integer.parseInt(userInput);
      System.out.println(num);
    }
    catch(NumberFormatException e)
    {
      System.out.println("정수만 입력");
    }
    
  }
  
  public static void method3()
  {
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    for(int i = 0; i < userInputs.length; i++)
    {
      try
      {
        int num = Integer.parseInt(userInputs[i]);
        System.out.println(num);
      }
      catch(NumberFormatException e)
      {
        System.out.println(userInputs[i] + "는 정수가 아님");
      }
    }
  }
  
  public static void method4()
  {
    // 다중 캐치 블록
    
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    try 
    {
      for(int i = 0; i < userInputs.length; i++)
      {
        int num = Integer.parseInt(userInputs[i]);
        System.out.println(num);
      }
    }
    catch(NumberFormatException e)
    {
      System.out.println("정수만 처리 가능");
    }
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    method3();
  }

}
