package practice02_Cup;

public class Carrier
{
  private Cup[] cups;
  private int idx;
  
  public Carrier(int cupCount)
  {
    cups = new Cup[cupCount];
  }
  
  public void addCup(Cup cup)
  {
    if(idx >= cups.length)
    {
      System.out.println("꽉 찼다");
      return;
    }
    
    cups[idx++] = cup;
    System.out.println("현재 컵은 " + idx + "개" + "빈자리는 " + (cups.length - idx) + "개");
  }
  
  public void whoami()
  {
    for(int i = 0; i < idx; i++)
    {
      cups[i].whoami();
    }
  }
  
}
