package practice02_BankAccount;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    // 생성자
    BankAccount account1 = new BankAccount();
    // Setter
    account1.setAccNo("01098765432");
    account1.setBalance(100000);   
    
    // 생성자
    BankAccount account2 = new BankAccount("01012345678", 50000);
    
    System.out.println();
    
    ////////////////////////////////////////////////////
    try
    {
      account1.deposit(100000);   //(성공)
      account1.deposit(-50000);   //(실패)    
      System.out.println();
      
      long money;
      money = account1.withdrawal(100000); //10만원 출금
      System.out.println(money);    // 100000(출금된 금액)
      money = account1.withdrawal(200000); // 출금 실패
      System.out.println(money);    // 0       
      System.out.println();
      ////////////////////////////////////////////////////
      
      account1.transfer(account2, 50000);  // 1 -> 2  5만원 이체(성공)
      account1.transfer(account2, 100000);  // 1 -> 2  10만원 이체(실패)
      
      System.out.println(account1.getBalance());
      System.out.println(account2.getBalance());
    }
    catch(RuntimeException e)
    {
      System.out.println(e.getMessage());
    }
    
    
    
  }

}
