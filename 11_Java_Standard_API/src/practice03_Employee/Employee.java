package practice03_Employee;

import java.util.Objects;

public class Employee
{
  private int empNo;
  private String name;
  public Employee()
  {
    // TODO Auto-generated constructor stub
  }
  public Employee(int empNo, String name)
  {
    super();
    this.empNo = empNo;
    this.name = name;
  }
  public int getEmpNo()
  {
    return empNo;
  }
  public void setEmpNo(int empNo)
  {
    this.empNo = empNo;
  }
  
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void info()
  {
    System.out.println("사원번호  :" + this.empNo);
    System.out.println("이름  :" + this.name);
  }
  @Override
  public int hashCode()
  {
    return Objects.hash(empNo);
  }
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    return empNo == other.empNo;
  }
  
  
}
