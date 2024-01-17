package pkg05_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass
{
  /*
   *  HashMap
   *  1. 객체(인스턴스)를 대신할 수 있는 자료구조
   *  2. 구성
   *    1) key : 데이터 식별자, Hashset으로 구성. 순서x 중복x
   *    2) Value : 데이터 자체
   *    3) Entry : Key와 Value 를 합쳐서 부르는 말
   * */
  public static void method1()
  {
    // Mutable 객체 (값이 변할 수 있는 객체)
    
    // HashMap 선언
    Map<String, Object> book;
    
    // HashMap 생성
    book = new HashMap<String, Object>();
    
    // Key, Value 추가 (Entry 추가)
    book.put("title", "어린왕자");
    book.put("author", "생텍쥐베리");
    book.put("isBestSeller", true);
    book.put("price", 10000);
    
    // Key 를 이용해서 Value 확인하기
    System.out.println(book.get("title"));
    System.out.println(book.get("author"));
    System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적");
    System.out.println(book.get("price") + "원");
  }
  
  public static void method2()
  {
    // Immutable 객체 (값을 바꿀 수 없는 객체)
    
    Map<String, Object> map = Map.of("name", "홍길동");
    
    // 값을 바꾸려는 시도
     //map.put("age", 10);
    
    System.out.println(map.get("name"));
  }
  
  public static void method3()
  {
    Map<String, Object> m = Map.of("name", "홍길동", "age", 10, "isMarried", false);
    Set<String> s =  m.keySet();
    
    for(String key : s)
    {
      System.out.println(key + ": " + m.get(key));
    }
  }
  
  public static void method4()
  {
    Map<String, Object> m = Map.of("name", "홍길동", "age", 10, "isMarried", false);
    Set<Entry<String, Object>> maps = m.entrySet();
    
    for(Entry<String, Object> ent : maps)
      System.out.println(ent.getKey() + ": " + ent.getValue());
  }
  
  public static void method5() 
  {
    Map<String, Object> m = new HashMap<String, Object>();
    
    // 처음 입력되는 key는 추가
    m.put("name", "홍길동");
    m.put("age", 10);
    m.put("isMarried", false);
    
    // 다시 입력되는 key는 수정을 의미
    m.put("age", 20);
    
    m.remove("isMarried");
    
    System.out.println(m);
  }
  
  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    method5();
  }

}
