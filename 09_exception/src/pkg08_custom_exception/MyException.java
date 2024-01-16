package pkg08_custom_exception;
/*
 *  사용자 예외 클래스
 *  1. exception 클래스를 상속한다.
 *  2. 클래스명은 exception 으로 끝나는 것이 좋다.
 * */

public class MyException extends Exception
{
  private int errorCode;
  
  public MyException(String message, int errorCode)
  {
    super(message);   // public Exception(String message) {} 생성자 호출
    this.errorCode = errorCode;
  }

  public int getErrorCode()
  {
    return errorCode;
  }
  public void setErrorCode(int errorCode)
  {
    this.errorCode = errorCode;
  }
  
  
}
