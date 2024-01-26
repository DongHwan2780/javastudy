package pkg04_Consumer;

import java.util.function.Consumer;

public class MainClass
{
  /*
   * java.util.function.Consumer
   * 1. 형식
   *  public interface Consumer<T>
   *    void accept(T t);
   *    
   * 2. 파라미터 O, 반환 x 형식의 accept() 메소드를 지원하는 함수형 인터페이스
   * */
  
  public static void method1()
  {
    Consumer<String> con = (name) -> System.out.println(name);
    con.accept("moon");
  }
  
  public static void method2(Consumer<String> con)
  {
    con.accept("moon");
  }
  
  public static void main(String[] args)
  {
    method1();
    method2((name) -> System.out.println(name));
  }
}
