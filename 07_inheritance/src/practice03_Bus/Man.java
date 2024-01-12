package practice03_Bus;

public class Man extends Person
{
  private String name;
  
  public Man(String name)
  {
    this.name = name;
  }
  
  public void ShowName()
  {
    System.out.println(this.name);
  }
}
