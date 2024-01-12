package practice05_Bakery;

public class Customer
{
  private int money, count;
  
  public Customer()
  {
    // TODO Auto-generated constructor stub
  }
  public Customer(int money, int count)
  {
    super();
    this.money = money;
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
  
  public int getCount()
  {
    return count;
  }
  public void setCount(int count)
  {
    this.count = count;
  }
  
  public void buy(Bakery bakery, int count, int money)
  {
    if(this.money < money)
    {
      System.out.println("가진 돈 부족");
      return;
    }
    
    BreadChange breadChange = null;
    if(bakery != null)
    {
      breadChange = bakery.sell(money, count);
    }
    
    if(breadChange != null)
    {
      count += breadChange.getBread();
      money += breadChange.getChange();
      this.money -= money;      
    }
    
    
    
  }
}
