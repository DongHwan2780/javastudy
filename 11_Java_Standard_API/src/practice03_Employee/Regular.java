package practice03_Employee;

public class Regular extends Employee
{
  private int salary;
  
  public Regular()
  {
    super();
    // TODO Auto-generated constructor stub
  }

  public Regular(int empNo, String name)
  {
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }

  public Regular(int empNo, String name, int salary)
  {
    super(empNo, name);
    this.salary = salary;
  }

  public int getSalary()
  {
    return salary;
  }
  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  
  @Override
  public void info()
  {
    super.info();
    System.out.println("연봉: " + this.salary);
  }
}
