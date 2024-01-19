package practice03_Employee;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Company comp = new Company("aaa");
    CompanyHandler ch = new CompanyHandler(comp);
    
    ch.manage();
  }

}
