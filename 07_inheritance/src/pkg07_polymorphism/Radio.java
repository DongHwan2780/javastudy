package pkg07_polymorphism;

public class Radio extends Elec
{
  @Override
  public void powerOn()
  {
    System.out.println("라디오를 켰다!");
  }
}
