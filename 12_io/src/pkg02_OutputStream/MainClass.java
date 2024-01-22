package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Arrays;

public class MainClass
{
  /*
   *  java.io.FileOutputStream
   *  1. 바이트 기반의 파일 출력 스트림이다.
   *  2. 출력 단위
   *    1) int 
   *    2) byte[]
   * */

  /*
   *  java.io.BufferedOutputStream
   *  1. 버퍼링을 지원하는 바이트 출력 스트림이다
   *  2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   *  3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   * */
  
  /*
   *  java.io.DateOutputStream
   *  1. 자바 변수 값을 그대로 출력하는 바이트 출력 스트림
   *  2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   *  3. 타입 별로 전용 메소드가 존재한다.
   *  
   * */
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함게 사용해야 한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다. (필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   */
  
  public static void method1()
  {
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    // 디렉터리
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample1.dat");
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try 
    {
      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(c);
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      
      out.close();
      
      System.out.println(file.length() + "크기의 " + file.getPath() + " 파일 생성");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if(out != null)
          out.close();
      }
      catch(Exception e2)
      {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void method2()
  {
    // 추가모드
    
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    FileOutputStream fos = null;

    try
    {
      fos = new FileOutputStream(new File(dir, "sample2.dat"), true);
      
      String s1 = "안녕하세요 반갑습니다\n";
      byte[] a = s1.getBytes();
      
      fos.write(a);
      fos.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if(fos != null)
          fos.close();       
      }
      catch(Exception e2)
      {
        e2.printStackTrace();
      }
    }
  }
  
  public static void method3()
  {
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 출력 스트림
    BufferedOutputStream bos = null;
    try
    {
      bos = new BufferedOutputStream(new FileOutputStream(file));
      
      String str1 = "how do you do? nice to meet you\n";
      String str2 = "i'm fine thank you";

      bos.write(str1.getBytes());
      bos.write(str2.getBytes());
      
      bos.close();
      
      System.out.println(file.length() + "크기의 " + file.getPath() + " 파일 생성");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static void method4()
  {
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample6.dat");
    DataOutputStream dos = null;
    
    try
    {
      dos = new DataOutputStream(new FileOutputStream(file));
      
      String name = "홍";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      dos.writeUTF(name);
      dos.writeInt(age);
      dos.writeDouble(height);
      dos.writeBoolean(isAdult);
      dos.writeChar(gender);
      
      dos.close();
      System.out.println(file.length() + "크기의 " + file.getPath() + " 파일 생성");
    }catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method5()
  {
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample10.dat");
    
    // 객체 출력 스트림 선언
    ObjectOutputStream out = null;
    try {
      
      // 객체 출력 스트림 생성
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 객체
      Employee employee = new Employee(1, "홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2, "홍길순"), new Employee(3, "홍순자"));
      
      
      // 객체 출력
      out.writeObject(employee);
      out.writeObject(employees);
      
      // 객체 출력 스트림 닫기
      out.close();

      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    //method3();
    
//    practice1();
//    practice2();
    //method4();
    method5();
  }

  public static void practice1()
  {
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample4.dat");
    FileOutputStream fos = null;
    
    try
    {
      fos = new FileOutputStream(file);
      String s = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세\n 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
      long start = System.nanoTime();
      fos.write(s.getBytes());
      long end = System.nanoTime();
      fos.close();
      System.out.println(file.length() + "크기의 " + file.getPath() + " 파일 생성");
      System.out.println("걸린시간:" + (end - start));
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void practice2()
  {
    File dir = new File("\\storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample5.dat");
    BufferedOutputStream bos = null;
    try
    {
      bos = new BufferedOutputStream(new FileOutputStream(file));
      String s = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세\n 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
      long start = System.nanoTime();
      bos.write(s.getBytes());
      long end = System.nanoTime();
      bos.close();
      System.out.println(file.length() + "크기의 " + file.getPath() + " 파일 생성");
      System.out.println("걸린시간:" + (end - start));
      
    } catch (Exception e)
    {
      e.printStackTrace();
    }
    
  }
}
