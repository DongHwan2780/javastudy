package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Company
{
  private String name;
  List<Employee> empList;
  private Scanner sc;
  
  public Company(String name)
  {
    this.name = name;
    empList = new ArrayList<Employee>();
    sc = new Scanner(System.in);
  }

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  
  // 고용
  public void hire(Employee emp) throws RuntimeException
  {
    if(emp == null)
      throw new RuntimeException("사원 정보 틀림");
    
    empList.add(emp);
  }
  // 해고
  public void fire(int idx) throws RuntimeException
  {
    if(empList.get(idx) == null)
      throw new RuntimeException("사원 번호 틀림");
    else if(empList.isEmpty())
      throw new RuntimeException("사원이 없음");
    
    //empList.remove(idx - 1);
    
    for(int i = 0, size = empList.size(); i < size; i++)
    {
      if(empList.get(i).getEmpNo() == idx)
      {
        empList.remove(i);
        break;
      }
    }
  }
  
  // 조회
  public void search(int idx) throws RuntimeException
  {
    if(empList.get(idx) == null)
      throw new RuntimeException("사원 번호 틀림");
    else if(empList.isEmpty())
      throw new RuntimeException("사원이 없음");
    
    //empList.get(idx - 1).info();
    
    Employee searchEmp = new Employee(idx, null);
    for(Employee emp : empList)
      if(emp.equals(searchEmp))
        emp.info();
    
  }
  // 전체조회
  public void searchAll() throws RuntimeException
  {
    if(empList.isEmpty())
      throw new RuntimeException("사원이 없음");
    
    System.out.println("전체 사원 명단");
    for(Employee emp : empList)
    {
      emp.info();
      System.out.println("=================");
    }
  }
}
