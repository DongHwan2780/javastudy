package pkg01_extends;

public class Car
{
  private String model;
  protected String maker;
  
  public void forward()
  {
    System.out.println("앞으로");
  }
  
  public void reverse()
  {
    System.out.println("뒤로");
  }
  
  public void stop()
  {
    System.out.println("멈춤");
  }
}
