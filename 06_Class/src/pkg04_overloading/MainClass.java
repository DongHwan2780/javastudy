package pkg04_overloading;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Calculator calculator = new Calculator();
    Adder adder = new Adder();
    
    calculator.add(adder, 10, 20);
    
    calculator.add(adder, 10, 20, 30, 40);
    
    calculator.add(adder, 1.0, 2.0);
  }

}
