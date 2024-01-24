package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import pkg02_OutputStream.Employee;

public class MainClass
{

  /*
   *  java.io.FileInputStream
   *  1. 바이트 기반의 파일 입력 스트림이다
   *  2. 입력 단위
   *    1) int
   *    2) byte[]
   * */
  
  
  /*
   * java.io.BufferedInputStream
   * 1. 버퍼링을 지원하는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   */
  
  /*
   * java.io.DataInputStream
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 함
   * 3. 타입 별로 전용 메소드가 존재
   * 
   * */
  
  /*
   * java.io.ObjectInputStream
   * 1. 객체로 구성된 데이터를 읽는 바이트 입력 스트림
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 함
   * 3. 읽은 객체는 Object 타입으로 반환되므로 객체 타입으로 캐스팅해서 사용해야 함
   *  -> ClassNotFoundException 발생 가능
   * */
  
  
  
  public static void method1()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.dat");
    
    FileInputStream fis = null;
    
    try
    {
      fis = new FileInputStream(file);
      
      
      byte[] b = new byte[(int)file.length()];
      int c;
      int cnt = 0;
      while(true)
      {
        c = fis.read();
        if(c == -1)
          break;
        
        b[cnt++] = (byte)c;
      }
      
      System.out.println(new String(b));
      fis.close();
      
    }catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch(IOException e)
    {
      System.out.println("입출력예외");
    }
    
  }
  
  public static void method2()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.dat");
    
    FileInputStream fis = null;   
    
    try
    {
      fis = new FileInputStream(file);
      byte[] b = new byte[(int)file.length()];
      
      byte[] bytes = new byte[5];
      int idx = 0;
      
      while(true)
      {
        int readByte = fis.read(bytes);
        if(readByte == -1)
          break;
        
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length; 
        
        
      }
      
      System.out.println(new String(b));
      fis.close();
    }catch(FileNotFoundException e)
    {
      System.out.println("파일이 없음");
    }
    catch(IOException e)
    {
      System.out.println("입출력 문제 발생");
    }
  }
  
  public static void method3()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    try {
      
      // 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];
      
      // 읽을 단위 (byte[] 배열로 읽는다.)
      byte[] bytes = new byte[5];
      int idx = 0;
      
      // 읽기
      int readByte = 0;
      while( (readByte = in.read(bytes)) != -1 ) {
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length;  // idx += readByte;
      }
      
      // 확인
      System.out.println(new String(b));
      
      // 파일 입력 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void method4()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample6.dat");
    DataInputStream dis = null;
    
    try
    {
      dis = new DataInputStream(new FileInputStream(file));
      
      String name = dis.readUTF();
      int age = dis.readInt();
      double height = dis.readDouble();
      boolean isAdult = dis.readBoolean();
      char gender = dis.readChar();
      
      dis.close();
      System.out.println(name);
      System.out.println(age);
      System.out.println(height);
      System.out.println(isAdult);
      System.out.println(gender);
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static void method5()
  {
    File dir = new File("\\storage");
    File file = new File(dir, "sample10.dat");
    ObjectInputStream ois = null;
    
    try
    {
      ois = new ObjectInputStream(new FileInputStream(file));
      
      Employee emp1 = (Employee)ois.readObject();
      List<Employee> emp2 = (List<Employee>)ois.readObject();
      
      System.out.println(emp1.toString());
      System.out.println(emp2.get(0));
      System.out.println(emp2.get(1));
      ois.close();
      
    }catch(ClassNotFoundException | IOException e)
    {
      e.printStackTrace();
    }
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    //method4();
    method5();
  }

}
