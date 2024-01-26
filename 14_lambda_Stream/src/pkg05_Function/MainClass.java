package pkg05_Function;

import java.util.function.Function;

public class MainClass
{

  /*
   * java.util.function.Function
   * 1. 형식
   *  public interface Function<T>
   *    R apply(T t);
   *    
   * 2. 파라미터 O, 반환 O 형식의 apply() 메소드를 지원하는 함수형 인터페이스
   * */
  
  public static void method1()
  {
    Function<String, String> func = (name) -> name;
    System.out.println(func.apply("moon"));
  }
  
  public static void method2(Function<String, String> func)
  {
    System.out.println(func.apply("moon"));
  }
  
  public static void main(String[] args)
  {
    method1();
    method2((name) -> name );
  }
}
