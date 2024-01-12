package practice05_Bakery;

public class Bakery
{
  public final static int PRICE = 500;
  private int count, money;
  
  public Bakery()
  {
    // TODO Auto-generated constructor stub
  }
  public Bakery(int count, int money)
  {
    super();
    this.count = count;
    this.money = money;
  }
  
  public int getCount()
  {
    return count;
  }
  public void setCount(int count)
  {
    this.count = count;
  }
  
  public int getMoney()
  {
    return money;
  }
  public void setMoney(int money)
  {
    this.money = money;
  }
  
  public BreadChange sell(int money, int count)
  {
    if(this.count < count)
    {
      System.out.println("빵 없음");
      return null;
    }
    
    if(this.money < money - (count * this.PRICE))
    {
      System.out.println("잔돈 없음");
      return null;
    }
    
    if(money < count * this.PRICE)
    {
      System.out.println("돈 더 주세요");
      return null;
    }
    
    this.money += count * this.PRICE;
    this.count -= count;
    
    return new BreadChange(count, money - (count * this.PRICE));
  }
}
