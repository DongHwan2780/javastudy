package pkg02_finally;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // finally 블록 : 마지막에 추가할 수 있는 선택 블록으로 항상 실행된다.
    String userInput = "12.3";
    
    try
    {
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    }
    catch(NumberFormatException e)
    {
      System.out.println("정수가 아님");
    }
    finally
    {
      System.out.println("작업종료");
    }
  }

}
