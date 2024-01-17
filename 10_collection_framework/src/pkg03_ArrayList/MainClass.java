package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass
{
  /*
   *  ArrayList 클래스
   *  1. 배열 리스트를 구현한 클래스
   *  2. 실무에서는 배열 대신 사용
   *  3. 배열의 특징을 그대로 가지고 있다.
   *    1) 순서대로 데이터가 저장된다
   *    2) 인덱스를 가지고 있다
   * */

  public static void method1()
  {
     // ArrayList 선언(사용 가능 타입 : Collection<e>)
    List<Integer> iList;    // int[] iList;
    
     // ArrayList 생성
    iList = new ArrayList<Integer>();
    
    // 요소 추가하기
    iList.add(5);
    iList.add(4);
    iList.add(3);
    iList.add(2);
    iList.add(1);
    
    // 요소 가져오기
    System.out.println(iList.get(0));
    System.out.println(iList.size());
  }
  
  public static void method2()
  {
    List<String> sList;
    sList = new ArrayList<String>();
    
    sList.add("게임");
    sList.add("여행");
    sList.add("수영");
    sList.add("레고");
    sList.add("모임");
    
    for(String s : sList)
      System.out.println(s);
  }
  
  public static void method3()
  {
    // 배열을 List로 바꾸기
    Integer[] arr = new Integer[] {10, 20, 30};
    
    // 배열을 List로 바꿔서 반환하는 Arrays 클래스의 asList 메소드
    
    List<Integer> iList = Arrays.asList(arr);
    
    // 주의
    // iList는 길이 변경 불가(추가,삭제 불가)
    
    System.out.println(iList);
    System.out.println(iList.toString());
  }
  
  public static void method4()
  {
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄");
    seasons.add("여름");
    seasons.add("햄버거");
    seasons.add("피자");
    seasons.add("겨울");
  
    
    seasons.set(2, "가을");
    
    seasons.remove(3);
    
    for(String s : seasons)
      System.out.println(s);
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    //method3();
    method4();
  }

}
