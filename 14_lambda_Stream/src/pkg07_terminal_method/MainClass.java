package pkg07_terminal_method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MainClass
{

  public static void method1()
  {
    // java.util.stream.Stream 생성
    Stream<String> seasons = Stream.of("봄", "여름", "가을", "겨울");
    
    // forEach() 메소드 호출
    // Stream 에 저장된 요소를 하나씩 Consumer 의 파라미터에 전달하는 메소드
    seasons.forEach( (season) -> System.out.println(season) );
  }
  
  public static void method2()
  {
    // 배열을 Stream 으로 만들기
    String[] seasons = {"spring", "summer", "autumn", "winter"};
    Stream<String> stream = Arrays.stream(seasons);
    
    // forEach() 메소드
    stream.forEach((season) -> {
      System.out.println(season);
    });
  }
  
  public static void method3()
  {
    List seasons = Arrays.asList("봄", "여름", "가을", "겨울");
    Stream<String> stm = seasons.stream();
    stm.forEach(season -> System.out.println(season));  
    
    new HashSet<String>(seasons).stream().forEach((season) -> System.out.println(season));
  }
  
  public static void method4()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.txt");
    
    BufferedReader br = null;
    
    try
    {
      br = new BufferedReader(new FileReader(file));
      
      StringBuilder sb = new StringBuilder();
      br.lines().forEach((line) -> sb.append(line).append("\n"));
      
      
      br.close();
      
      System.out.println(sb.toString());
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static void method5()
  {
    File javaHome = new File("\\program Files\\java\\jdk-17");
    File[] files = javaHome.listFiles();
    
    //Stream<File> stm = Arrays.stream(files);
    Stream<File> stm = Arrays.stream(javaHome.listFiles());
    stm.forEach(file -> System.out.println(file.getName()));
    
    try
    {
      Path path = Paths.get("\\program Files\\java\\jdk-17");
      Stream<Path> stm2 = Files.list(path);
      
      stm2.forEach(p -> System.out.println(p.getFileName()));
      stm2.close();
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method4();
    method5();
  }

}
