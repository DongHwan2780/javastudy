package practice04_Car;

public class Car
{
  private Driver driver;
  private int currspeed, fuel;
  public final static int MAX_SPEED = 100;
  
  public Car()
  {
    // TODO Auto-generated constructor stub
  }
  public Car(Driver driver, int currspeed, int fuel)
  {
    super();
    this.driver = driver;
    this.currspeed = currspeed;
    this.fuel = fuel;
  }
  public Driver getDriver()
  {
    return driver;
  }
  public void setDriver(Driver driver)
  {
    this.driver = driver;
  }
  
  public int getCurrspeed()
  {
    return currspeed;
  }
  public void setCurrspeed(int currspeed)
  {
    this.currspeed = currspeed;
  }
  
  public int getFuel()
  {
    return fuel;
  }
  public void setFuel(int fuel)
  {
    this.fuel = fuel;
  }
  
  public void enginestart()
  {
    if(driver == null || fuel == 0)
      System.out.println("시동 실패");
    else
      System.out.println("시동 성공");
  }
  
  
  // 1초당 n씩 속도증가 bd = 10, not bd = 5
  public void accelerator(int pushTime)
  {
    if(currspeed == MAX_SPEED)
    {
      System.out.println("이미 최고 속도");
      return;
    }
    
    if(fuel == 0)
    {
      System.out.println("연료 없음");
      return;
    }
    
    if(pushTime <= 0)
    {
      System.out.println("악셀을 잘 밟으세요");
    }
    
    if(this.driver.isBestDriver())
      currspeed += (pushTime * 10);
    else
      currspeed += (pushTime * 5);
      
    fuel -= pushTime;
    fuel = Math.max(fuel, 0);
    currspeed = Math.min(currspeed, MAX_SPEED);
    System.out.println("현재 연료:" + fuel + "현재 속도:" + currspeed);
  }
  
  
  public void brake(int pushTime)
  {
    if(currspeed == 0)
    {
      System.out.println("이미 정지 상태");
      return;
    }
    
    if(pushTime <= 0)
    {
      System.out.println("브레이크를 잘 밟으세요");
    }
    
    currspeed -= (pushTime * 10);
    currspeed = Math.max(currspeed, 0);
    
    System.out.println("현재 연료:" + fuel + "현재 속도:" + currspeed);
  }
}
