package pkg09_access_modifier;

public class Calculator
{
  
  public void add(int... params)
  {
    int iTotal = 0;
    
    if(params.length == 0)
    {
      System.out.println("합:" + iTotal);
      return;
    }
    
    if(params.length == 1)
    {
      iTotal = params[0];
      System.out.println("합:" + iTotal);
      return;
    }
    
    System.out.print(params[0]);
    iTotal = params[0];
    for(int i = 1; i < params.length; i++)
    {
      iTotal += params[i];
      System.out.print("+" + params[i]);
    }
    
    System.out.println(" = " + iTotal);
    
  }

  
}