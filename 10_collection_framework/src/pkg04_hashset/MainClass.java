package pkg04_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass
{
  public static void method1()
  {
    Set<String> s;
    s = new HashSet<String>();
    
    // 요소 추가(순서 없이 저장되고, 중복 저장 불가)
    s.add("노래");
    s.add("게임");
    s.add("영화");
    s.add("수영");
    s.add("게임");
    
    for(String a : s)
      System.out.println(a);
  }
  
  
  public static void method2()
  {
    Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
    Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(6,7,8,9,10));
    
    s1.retainAll(s2);
    System.out.println(s1);
  }
  
  public static void method3()
  {
    Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
    Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(6,7,8,9,10));
    
    s1.addAll(s2);
    System.out.println(s1);
  }
  
  public static void method4()
  {
    Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
    Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(6,7,8,9,10));
    
    s1.removeAll(s2);
    System.out.println(s1);
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    method1();
    method2();
    method3();
    method4();
  }

}
