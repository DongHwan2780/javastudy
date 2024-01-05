package pkg02_loop;

public class Class03_break
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //  break : loop문을 종료한다.
    
    // while 을 이용한 무한 루프
    int i = 1;
    while(true)
    {
      if(i > 5)
        break;
      
      System.out.println(i++);
    }
    // for 를 이용한 무한 루프
    i = 1;
    for(;;)
    {
      if(i == 6)
        break;
      
      System.out.println(i++);
    }
    
    
  }

}
