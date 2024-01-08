package pkg02_two;

public class MainClass
{
  public static void method1()
  {
    /*
     *  2차원 배열
     *  1. 1차원 배열이 여러 개 모인 자료 구조
     *  2. 1차원 배열 여러 개를 같은 이름으로 관리
     *  3. 행과 열의 집합체인 테이블 구조로 이해를 하면 된다
     * 
     * */
    
    
    /*
     *  2차원 배열의 선언과 생성
     *  1. 선언
     *    int[][] 배열이름
     *    int 배열이름[][]
     *  2. 생성    
     *    1) new int[m][n] - 길이가 n인 1차원 배열이 m개
     *    2) new int[?][n] - 길이가 ?인 1차원 배열이 m개
     * */

    // 배열 선언
    int[][] arr;
    
    // 배열 생성 
    arr = new int[2][3];
    
    // 배열 요소(배열 이름 + 대괄호 2개 + 인덱스 2개)
    for(int i = 0; i < arr.length; i++)
      for(int j = 0; j < arr[0].length; j++)
        System.out.println(arr[i][j]);

  }
  
  public static void method2()
  {
    // 2차원 배열의 선언 및 생성
    int[][] arr = new int[2][3];
    
    System.out.println(arr[0]);   // 참조값
    System.out.println(arr[0].length);  // 3
  }
  
  public static void method3()
  {
    
  }
  
  public static void method4()
  {
    int[][] arr = new int[][] {{10, 20, 30}, {40, 50, 60}} ;
    
    for(int i = 0; i < arr.length; i++)
      for(int j = 0; j < arr[0].length; j++)
        System.out.println(arr[i][j]);
    
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
      method4();
  }

}
