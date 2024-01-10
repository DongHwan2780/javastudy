package pkg09_access_modifier;


/*
 *  Getter
 *  1. 클래스의 필드값을 외부로 반환하는 메소드
 *  2. get + 필드명으로 메소드이름을 결정해야 한다.(boolean타입은 is + 필드명)
 * */

/*
 *  Setter
 *  1. 외부로부터 전달된 값을 필드에 저장하는 메소드
 *  2. set + 필드명으로 메소드이름을 결정해야 한다.
 * */



public class Computer
{
  private String sModel;
  private int iPrice;
  private Calculator calculator;
  
  public Computer(String sModel, int iPrice, Calculator calculator)
  {
    this.sModel = sModel;
    this.iPrice = iPrice;
    this.calculator = calculator;
  }

  public String getsModel()
  {
    return sModel;
  }

  public void setsModel(String sModel)
  {
    this.sModel = sModel;
  }

  public int getiPrice()
  {
    return iPrice;
  }

  public void setiPrice(int iPrice)
  {
    this.iPrice = iPrice;
  }

  public Calculator getCalculator()
  {
    return calculator;
  }

  public void setCalculator(Calculator calculator)
  {
    this.calculator = calculator;
  }

  

  
}
