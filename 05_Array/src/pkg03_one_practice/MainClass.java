package pkg03_one_practice;

public class MainClass
{
  public static void method1()
  {
    int month = 12;
    String[] sArr = new String[] {"겨울", "봄", "여름", "가을"};
    
    System.out.println(sArr[month % 12 / 3]);
  }
  
  public static void method2()
  {
    int i = 4;
    int n = 10;
    String[] sArr = new String[] {"일", "월", "화","수", "목", "금", "토"};
    
    i += n;
    System.out.println(sArr[i % 7]);
  }
  
  public static void method3()
  {
    char[] cArr = new char[26];
    char ch = 'A';
    
    for(int i = 0; i < cArr.length; i++)
      cArr[i] = ch++;
    
    for(int i = 0; i < cArr.length; i++)
      System.out.println(cArr[i]);
    
  }
  
  public static void method4()
  {
    int[] a = new int[] {10, 20, 30, 0, 0, 0};
    int[] b = new int[] {40, 50, 60};
    
    for(int i = a.length - b.length; i < a.length; i++)
      a[i] = b[i - b.length];
      
    
    for(int i = 0; i < a.length; i++)
      System.out.println(a[i]);
    
    /*
     *  배열 복사를 위한 자바 표준 API
     *  System.arraycopy(b, 0, a, 3, b.length)
     * */
  }
  
  public static void method5()
  {
    // 10 진수를 2진수로 변환하기
    int number = 35;
    
    int[] iArr = new int[10];
    int icnt = 0;
    while(number > 0)
    {
      iArr[icnt++] = number % 2;
      number /= 2;
    }
    
    for(int i = icnt - 1; i >= 0; i--)
      System.out.println(iArr[i]);
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //method1();
    //method2();
    //method3();
    method4();
    method5();
  }

}
