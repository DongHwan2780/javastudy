package practice03_Bus;

public class Bus
{
  private Person[] seats = new Person[10];
  private int idx;
  
  public Bus()
  {

  }
  
  public void on(Person person)
  {
    if(seats.length <= idx)
    {     
      System.out.println("꽉참");
      return;
    }
    
    if(idx != 0)
    {      
      for(int i = 0; i < seats.length; i++)
      {
        if(seats[i] == null)
        {
          seats[i] = person;
          return;
        }
      }
    }
    else
      seats[idx++] = person; 
  }
  
  public void off(int idx)
  {
    seats[idx] = null;
  }
  
  public void info()
  {
    for(int i = 0; i < seats.length; i++)
    {
      if(seats[i] != null)
        seats[i].ShowName();
      else
        System.out.println("빈자리");
    }
  }
  
}
