package pkg05_void_return;

public class Calculator
{
  void root(int a)
  {
    if(a <= 0)
      System.out.println(a + "는 제곱근을 계산할 수 없습니다.");
    else
      System.out.println(a + "의 제곱근은" + Math.sqrt(a) + "입니다.");
    
    return;
  }
}
