package practice03_Bus;

public class Bus
{
  private Seat[] seats;
  private int idx;
  
  public Bus()
  {
     seats = new Seat[25];
     for(int i = 0; i < seats.length; i++)
       seats[i] = new Seat();
  }
  
  public void on(Person person)
  {
    if(seats.length <= idx)
    {     
      System.out.println("꽉참");
      return;
    }
    

     seats[idx++].sit(person); 
  }
  
  public void off(int idx)
  {
    seats[idx].setPerson(null);
    this.idx--;
  }
  
  public void info()
  {
    for(int i = 0; i < seats.length; i++)
    {
      if(seats[i].getPerson() != null)
        seats[i].showName();
      else
        System.out.println("빈자리");
    }
  }
  
}
