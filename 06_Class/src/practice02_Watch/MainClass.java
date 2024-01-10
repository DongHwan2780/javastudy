package practice02_Watch;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Watch watch = new Watch(9, 0, 0);
        
    watch.addHour(3);       // 12:00:00
    System.out.println();
    
    watch.addMinute(80);    // 13:20:00
    System.out.println();
    
    watch.addSecond(3650);    // 14:20:50
    System.out.println();
    
    watch.see();    // 14:20:50
  }

}
