package pkg01_string;

public class Class02_StringBuilder
{
  /*
   *          StringBuffer      StringBuilder
   *  since   JDK 1.0           JDK 1.5
   *  thread  multi             single
   *  speed   slow              fast
   *  
   * */
  
  public static void main(String[] args)
  {
    StringBuilder sb = new StringBuilder();
    
    sb.append("바");
    sb.append("나");
    sb.append("나");
    
    
    // String 객체로 바꾸기
    // 1. new String(builder)
    // 2. builder.toString()
    
    String result = sb.toString();
    System.out.println(result);
    
  }
}
