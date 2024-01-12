package practice03_Bus;

public class Woman extends Person
{
  private String name;
  
  public Woman(String name)
  {
    this.name = name;
  }
  
  
  public void ShowName()
  {
    System.out.println(this.name);
  }
}
