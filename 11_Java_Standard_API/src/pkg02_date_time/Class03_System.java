package pkg02_date_time;
import java.text.SimpleDateFormat;

public class Class03_System
{
  public static void main(String[] args)
  {
    // 1. 현재 timestamp 가져오기
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
    System.out.println(sdf.format(timestamp));
    
    
    // 2. 특정 시간을 nano 초 단위로 가져오기
    // 2개의 시간을 가져와서 차이를 구할 때 사용
    long start = System.nanoTime();
    System.out.println("hello world");
    long end = System.nanoTime();
    System.out.println(end - start + "ns");
    
    
    practice01();
    practice02();
    
  }
  
  public static void practice01()
  {
    // string 을 이용한 문자열 연결
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String result = "";
    
    long start = System.nanoTime();
    for(int i = 0; i < alphabet.length; i++)
      result += alphabet[i];
    
    long end = System.nanoTime();
    
    System.out.println(result);
    System.out.println("+ 걸린시간:" + (end - start) + "ns");
    
  }
  
  public static void practice02()
  {
    // stringbuilder 를 이용한 문자열 연결 (append)
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    StringBuilder sb = new StringBuilder();
    
    long start = System.nanoTime();
    for(int i = 0; i < alphabet.length; i++)
      sb.append(alphabet[i]);
    
    long end = System.nanoTime();
    
    String result = sb.toString();
    System.out.println(result);
    System.out.println("빌더 걸린시간:" + (end - start) + "ns");
  }
  
}
