package pkg04_checked;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // checked exception : try - catch 와 같은 예외 처리 코드가 없으면 동작하지 않는 예외
    
    try
    {
      URL url = new URL("https://www.google.com/");    
    }
    catch(MalformedURLException e)
    {
      System.out.println("잘못된");
    }
  }

}
