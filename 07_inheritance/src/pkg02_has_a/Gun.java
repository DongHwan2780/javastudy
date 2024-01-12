package pkg02_has_a;

public class Gun
{
  private int bullet;
  public final static int MAX_BULLET = 20; 
  
  public Gun()
  {
    bullet = 10;
  }
  
  public void shoot()
  {
    if(bullet == 0)
    {
      System.out.println();
      return;
    }
    
    System.out.println("빵야! 현재 총알: " + --this.bullet + "개");
  }
  
  public void reload(int bullet)
  {
    if(bullet <= 0)
    {
      System.out.println("정상적으로 총알을 넣으세요");
      return;      
    }
    
    if(this.bullet + bullet > MAX_BULLET)
    {
      System.out.println("총알이 너무 많다");
      return;
    }
    
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료. 현재" + this.bullet + "발 있음");
  }
  
}
