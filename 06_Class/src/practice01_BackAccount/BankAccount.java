package practice01_BackAccount;

public class BankAccount
{
  // field
  private String accNo;
  private long balance;
  
  BankAccount()
  {
    System.out.println("계정 생성  " + "넘버:" + this.accNo + "잔액:" + this.balance);
  }
  BankAccount(String accNo ,int balance)
  {
    this.accNo = accNo;
    this.balance = balance;
    System.out.println("계정 생성  " + "넘버:" + this.accNo + "잔액:" + this.balance);
  }
  public void setAccNo(String accNo) { this.accNo = accNo; }
  public void setBalance(long balance) { this.balance += balance; }
  
  public String getAccNo() { return accNo; }
  public long getBalance() { return balance; }
  
  public void deposit(long money)    // 입금
  {
    if(money > 0)
    {
      this.balance += money;
      System.out.println(money + "원 입금 성공,  현재 잔액: " + this.balance);
    }
    else
      System.out.println("입금 실패");
      
  }
  
  public long withdrawal(long money) // 출금
  {
    if(this.balance >= money)
    {
      this.balance -= money;
      System.out.println(money + "원 출금 성공, 현재 잔액: " + this.balance);
      return money;
    }
    else
    {
      System.out.println("잔액 부족, 출금 실패");
      return 0;
    }
  }
  
  public void transfer(BankAccount account ,long money) // 송금
  {
    if(this.getBalance() >= money)
    {
      account.setBalance(money);
      this.setBalance(-money);      
      System.out.println(account.getAccNo() + "계좌로 " + money + "원 송금 성공");
    }
    else
      System.out.println("잔액 부족, 이체 실패");
  }
  
  
}
