package pkg08_Intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass
{

  public static void method1()
  {
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) {}
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Stream<Integer> stm = list.stream();
    stm.filter((num) -> num % 2 == 0)
    .forEach((num) -> System.out.println(num));
  }
  
  public static void method2()
  {
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 100), new Book("b", "bb", 200), new Book("c", "cc", 300), new Book("d", "dd", 400));
    
    books.stream()
    .filter((book) -> book.getPrice() >= 200)
    .forEach((book) -> System.out.println(book.getTitle()));
    
    List<Book> over = books.stream()
    .filter((book) -> book.getPrice() >= 400)
    .collect(Collectors.toList());
    
    System.out.println(over);
  }
  
  public static void method3()
  {
    // map() 메소드
    // Stream<T> map(Function<T,R> function) {}
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    list.stream()
    .map((number) -> number + 1)
    .forEach((number) -> System.out.println(number));
    
  }
  
  public static void method4()
  {
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 10000), new Book("b", "bb", 20000), new Book("c", "cc", 30000), new Book("d", "dd", 40000));
    
    List<Book> saleList = books.stream()
    .filter((book) -> book.getPrice() >= 20000)
    .map((book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2))
    .toList();
    
    saleList.stream()
    .forEach((book) -> System.out.println(book.getTitle() + ": " + book.getPrice()));
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    method4();
  }

}
