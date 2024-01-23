package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;import java.io.InputStream;

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
   *  java.io.BufferedInputStream
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
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    method2();
  }

}
