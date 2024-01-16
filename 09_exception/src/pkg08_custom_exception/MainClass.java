package pkg08_custom_exception;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    try
    {
      throw new MyException("예외메시지", 1000);
      //Integer.parseInt("12.3");
    } catch (MyException e)
    {
      System.out.println(e.getMessage());
      System.out.println(e.getErrorCode());
    }
  }

}
