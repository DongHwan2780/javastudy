package pkg07_constructor;

public class Computer
{
  String sModel;
  int iPrice;
  Calculator calculator;
  
  // constructor
  Computer()
  {
    System.out.println("Computer()");
  }
  Computer(String sModel, int iPrice)
  {
    this.sModel = sModel;
    this.iPrice = iPrice;
  }
  
  Computer(String sModel, int iPrice, Calculator calculator)
  {
   this.sModel = sModel;
   this.iPrice = iPrice;
   this.calculator = calculator;
  }
  
  void develop()
  {
    System.out.println(sModel + "이용해서 개발중");
  }

  void danggeun()
  {
    System.out.println(iPrice / 100 * 60 + "원에 쿨거래");
  }
  void thistest()
  {
    this.develop();
  }
}
