package pkg07_polymorphism;

public class Tv extends Elec
{
  @Override
  public void powerOn()
  {
    System.out.println("티비를 켰다!");
  }
}
