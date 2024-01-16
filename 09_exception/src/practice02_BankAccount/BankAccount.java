package practice02_BankAccount;

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
  
  
  // 1. 메소드마다 try - catch 넣기
  // 2. 메소드 호출한 곳으로 예외 던지기
  
  
  public void deposit(long money) throws RuntimeException    // 입금
  {
      if(money > 0)
      {
        this.balance += money;
        System.out.println(money + "원 입금 성공,  현재 잔액: " + this.balance);
      }
      else
        throw new RuntimeException(money + "원 입금 실패");
      
  }
  
  public long withdrawal(long money) throws RuntimeException// 출금
  {
      if(this.balance >= money)
      {
        this.balance -= money;
        System.out.println(money + "원 출금 성공, 현재 잔액: " + this.balance);
        return money;
      }
      else
        throw new RuntimeException("잔액 부족, 출금 실패");
    
  }
  
  public void transfer(BankAccount account ,long money) throws RuntimeException// 송금
  {
    account.deposit(withdrawal(money));
  }
  
  
}
