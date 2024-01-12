package pkg07_polymorphism;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Person person = new Person();
    Tv tv = new Tv();
    Radio radio  = new Radio();
    
    person.powerOn(tv);
    person.powerOn(radio);
  }

}
