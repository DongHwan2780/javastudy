package pkg02_Functional_Interface;

public class MainClass
{

  public static void main(String[] args)
  {
    MyInterface1 mif1 = () -> System.out.println("hello world");
    mif1.method1();
    
    MyInterface2 mif2 = () -> "hello world";
    System.out.println(mif2.method2());
    
    MyInterface3 mif3 = (s) -> System.out.println(s + "님");
    mif3.method3("동환");
    
    MyInterface4 mif4 = (s) -> s;
    System.out.println(mif4.method4("동환"));
  }
}
