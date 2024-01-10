package practice02_Watch;

public class Watch
{
  private int hour, minute, second;
  
  Watch(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  
  
  public int getHour()
  {
    return hour;
  }
  public void setHour(int hour)
  {
    this.hour = hour;
  }

  public int getMinute()
  {
    return minute;
  }
  public void setMinute(int minute)
  {
    this.minute = minute;
  }

  public int getSecond()
  {
    return second;
  }
  public void setSecond(int second)
  {
    this.second = second;
  }

  public void addHour(int time)
  {
    if(this.hour + time >= 24)
    {
      this.hour += time;
      this.hour %= 24;
      System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));     
    }
    else
    {
      this.hour += time;
      System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));
    }
  }
  
  public void addMinute(int time)
  {
    if(time >= 60)
    {
      this.minute += (time % 60);
      this.addHour(time / 60);
    }
    else
    {
      this.minute += time;
      System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));      
    }
    
  }
  
  public void addSecond(int time)
  {
     if(time >= 60)
     {
       this.second += (time % 60);
       addMinute(time / 60);
     }
     else
     {
       this.second += time;       
       System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));
     }
  }
  
  public void see()
  {
    System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));
  }
  
  
  
}
