package practice03_Bus;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Bus bus = new Bus();

    bus.on(new Man("a"));
    bus.on(new Man("b"));
    bus.on(new Man("c"));

    bus.info();

    System.out.println();

    bus.off(0);
    bus.off(1);
    
    bus.on(new Woman("x"));
    bus.on(new Woman("z"));
    
    bus.info();
   }

}
