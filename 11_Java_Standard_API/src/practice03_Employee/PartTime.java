package practice03_Employee;

public class PartTime extends Employee
{
  private int hourPay;
  
  public PartTime(int empNo, String name)
  {
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }

  public PartTime(int empNo, String name, int hourPay)
  {
    super(empNo, name);
    this.hourPay = hourPay;
  }

  public int getHourPay()
  {
    return hourPay;
  }
  public void setHourPay(int hourPay)
  {
    this.hourPay = hourPay;
  }
  
  @Override
  public void info()
  {
    super.info();
    System.out.println("시급: " + this.hourPay);
  }
}
