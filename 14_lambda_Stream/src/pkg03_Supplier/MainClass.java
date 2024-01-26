package pkg03_Supplier;

import java.util.function.Supplier;

public class MainClass
{
  public static void method1()
  {
    Supplier<String> sup = () -> "hello world";
    System.out.println(sup.get());
  }
  
  public static void method2(Supplier<String> sup)    // -> 값을 반환하는 람다를 줘라
  {
    System.out.println(sup.get());
  }

  public static void method3(Supplier<Integer> sup)
  {
    System.out.println(sup.get());
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    /*
     * java.util.function.Supplier
     * 1. 형식
     *  public interface Supplier<T>
     *  {
     *    T get();
     *  }
     * 2. 파라미터 X, 반환 O 형식의 get 메소드를 지원하는 함수형 인터페이스
     * */
    //method1();
    
    //Supplier<String> sup = () -> "hello world";    
    //method2(() -> "hello world");
    method3(() -> (int)(Math.random() * 10 + 1));
  }

}
