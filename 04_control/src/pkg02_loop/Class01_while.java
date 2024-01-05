package pkg02_loop;

public class Class01_while
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    
    /*
     *  while
     *  1. 조건식을 만족하면 반복해서 실행한다.
     *  
     *  
     * */
    
    int n = 1;
    while(n < 6)
    {
      System.out.println(n++);
    }
      
    n = 1;
    int iTotal = 0;
    
    while(n < 6)
    {
      iTotal += n;
      n++;
    }
    System.out.println(iTotal);
    

    int  i = 1;
    while(method1())
    {
      if(i > 5)
        break;
      
      System.out.println(i++);
    }
    
    
    
  }
  public static boolean method1()
  {
    boolean b = true;
    
    return b;
  }
}
