package pkg04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass
{
  /*
   * java.io.FileWriter
   * 1. 문자 기반의 파일 출력 스트림
   * 2. 출력 단위
   *  1) int
   *  2) char[]
   *  3) String
   * */
  
  /*
   * java.io.BufferedWriter
   * 1. 버퍼링을 지원하는 문자 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   * 4. 줄 바꿈을 위한 newLine() 메소드가 있다.
   */
  
  /*
   * java.io.PrintWriter
   * 1. print 메소드(print, println, printf)를 지원하는 문자 출력 스트림
   * 2. 메인 스트림 또는 보조 스트림으로 사용 가능
   * 
   * */
  
  public static void method1()
  {
    File dir = new File("\\storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample1.txt");
    
    // 파일 출력 스트림
    FileWriter fw = null;
    
    try
    {
      fw = new FileWriter(file);
      int ch = '대';
      char[] chArr = {'한', '민'};
      String str = "국";
      
      fw.write(ch);
      fw.write(chArr);
      fw.write(str);
      
      fw.close();
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static void method2()
  {
    File dir = new File("\\storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample2.txt");
    BufferedWriter bw = null;
    
    try
    {
      bw = new BufferedWriter(new FileWriter(file));
      
      bw.write("안녕하세요");
      bw.newLine();
      bw.write("반갑습니다");
      bw.newLine();
      bw.write("안녕");
      bw.newLine();
      bw.write("반갑");
      
      bw.close();
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    
  }
  
  public static void method3()
  {
    File dir = new File("\\storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample3.txt");
    
    PrintWriter pw = null;
    try
    {
      pw = new PrintWriter(file);

      pw.println("안녕하세요");
      pw.println("반갑습니다");
      
      pw.close();
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args)
  {
    //method1();
    //method2();
    method3();
  }
}
