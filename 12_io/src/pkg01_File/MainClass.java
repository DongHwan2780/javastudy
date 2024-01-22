package pkg01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass
{
/*
 *  java.io.File
 *  1. 디렉터리, 파일을 관리하는 클래스
 *  2. 디렉터리, 파일을 만들고 삭제할 수 있다.
 *  3. 디렉터리, 파일의 정보(이름, 경로, 크기, 최종수정일 등)를 확인할 수 있다.
 * 
 * */
  
  /*
   *  1. 경로 구분자 (separator)
   *    1) 윈도우 :     역슬래쉬
   *    2) 리눅스,mac : 슬래쉬
   *    3) File.separator 필드를 사용하면 플랫폼에 따른 경로 구분자가 자동 삽입
   *  2. 디렉터리
   *    1) 루트 : 경로 구분자로 시작하는 경로는 루트에서 시작하는 경로
   *    2) 상위 : ..
   *    3) 현재 : .
   * */
  
  public static void method1()
  {
    // 디렉터리 만들기 / 삭제하기
    // File 객체 선언
    File dir;
    
    // File 객체 생성
    dir = new File("\\storage");
    
    // 디렉터리 유무에 따른 생성
    if(!dir.exists())   // 디렉토리가 없으면
      dir.mkdirs();
    else   // 디렉토리가 있으면
      //dir.deleteOnExit(); JVM 실행이 종료된 이후에 삭제
      dir.delete(); // JVM 실행 중에 삭제
  }
  
  public static void method2()
  {
    // 파일 만들기/삭제하기
    
    // 파일이 저장될 디렉터리 작업
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 생성
    File file = new File(dir, "sample.txt");
    
    // 파일 유무에 따른 생성/삭제
    if(file.exists()) {  // 파일이 있으면
      file.delete();
    } else {             // 파일이 없으면
      try {
        file.createNewFile();  // IOException 처리가 반드시 필요하다.(Checked Exception)        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void method3()
  {
    /*
     *  File 클래스 주요 메소드
     *  1. listFiles() : 디렉터리 내의 모든 File 객체를 File[] 배열로 반환
     *  2. getName() : 이름 반환
     *  3. getParent() : 저장된 디렉터리 반환
     *  4. getPath() : getParent() + getName()
     *  5. lastModified() : 최종수정일을 long 타입으로 반환
     *  6. length() : 파일 크기를 long 타입으로 반환 (바이트 단위)
     *  7. idDirectory() : 디렉터리이면 true 반환
     *  8. isFile() : 파일이면 true 반환
     * */
    
    File javaHome = new File("\\program Files\\java\\jdk-17");
    File[] files = javaHome.listFiles();
    
    for(File file : files)
    {
      StringBuilder sb = new StringBuilder();
      
      sb.append(String.format("%-20s", file.getName().substring(Math.min(0, file.getName().length()))));
      
      String lastModified = new SimpleDateFormat("yyyy-MM-dd a h:mm").format(file.lastModified());
      sb.append(String.format("%-20s", lastModified));
      
      sb.append(String.format("%-10s", file.isDirectory() ? "파일 폴더" : "파일"));
      
      long byteSize = file.isDirectory() ? 0 : file.length();
      long kbSize = (byteSize / 1024) + (byteSize % 1024 != 0 ? 1 : 0);
      if(byteSize != 0)
          sb.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize) + "KB"));
      
      System.out.println(sb.toString());
    }
    
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    //method3();
    practice1();
    //practice2();
  }

  public static void practice1()
  {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy\\");
    String result = sdf.format(date);
    
    File dir = new File("\\" + result);
    if(!dir.exists())
      dir.mkdirs();
    
     sdf = new SimpleDateFormat("MM\\");
     result += sdf.format(date);
    
    dir = new File("\\" + result);
    if(!dir.exists())
      dir.mkdirs();
    
    sdf = new SimpleDateFormat("dd");
    result += sdf.format(date);
   
   dir = new File("\\" + result);
   if(!dir.exists())
     dir.mkdirs();
    
  }
  
  public static void practice2()
  {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy\\MM\\dd");
    String result = sdf.format(date);
    File dir = new File("\\" + result);
    
    if(dir.exists())
      dir.delete();
    
    result = result.substring(0, result.length() - 3);
    dir = new File("\\" + result);
    if(dir.exists())
      dir.delete();
    
    result = result.substring(0, result.length() - 3);
    dir = new File("\\" + result);
    if(dir.exists())
      dir.delete();
  }
}
