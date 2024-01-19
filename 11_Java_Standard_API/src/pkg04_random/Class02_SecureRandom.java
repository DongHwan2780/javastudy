package pkg04_random;

import java.security.SecureRandom;

public class Class02_SecureRandom
{
  public static void main(String[] args)
  {
    // nextDouble() : 0.0 <= 난수 < 1.0
    
    SecureRandom secureRandom = new SecureRandom("최".getBytes());
    
    if(secureRandom.nextDouble() < 0.05)
      System.out.println("대박");
    else
      System.out.println("쪽박");
    
    // nextInt() : int 범위 중 하나
    // nextInt(5) : 0 ~ 4 범위 중 하나
    // nextInt() + 1: 1 ~ 5 범위 중 하나
    
    int yut = secureRandom.nextInt(5) + 1;
    System.out.println(yut);
  }
}
