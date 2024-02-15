package pkg06_Predicate;

import java.util.function.Predicate;

public class MainClass
{
  /*
   * java.util.function.Predicate
   * 1. 형식
   *  public interface Predicate<T>
   *    boolean test(T t);
   *    
   * 2. 파라미터 O, 반환 boolean 형식의 test() 메소드를 지원하는 함수형 인터페이스
   * */
  
  public static void method1()
  {
    Predicate<Integer> isEvenNum = (number) -> number % 2 ==0;
    if(isEvenNum.test(5))
      System.out.println("짝수");
    else
      System.out.println("홀수");
  }
  
  public static void method2(Predicate<Integer> pred, int num)
  {
    if(pred.test(5))
      System.out.println("짝수");
    else
      System.out.println("홀수");
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    method1();
    method2( (number)-> number % 2 == 0 , 5);
  }

}