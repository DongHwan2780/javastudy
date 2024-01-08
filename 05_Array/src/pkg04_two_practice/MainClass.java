package pkg04_two_practice;

public class MainClass
{
  public static void method1()
  {
    int[][] iArr = new int[8][9];
    
    for(int i = 0; i < iArr.length; i++)
      for(int j = 0; j < iArr[0].length; j++)
        iArr[i][j] = (i + 2) * (j + 1);
    
    for(int i = 0; i < iArr.length; i++)
      for(int j = 0; j < iArr[0].length; j++)
        System.out.println((i + 2) + " x " + (j + 1) + " = " + (i + 2) * (j + 1));
  }
  
  public static void method2()
  {
    int[][] iApt = new int[][] {{2,3,2,4},{1,1,5,3},{4,2,2,1}};
    int tmp = 0;
    
    for(int i = 0; i < iApt.length; i++)
    {
      for(int j = 0; j < iApt[0].length; j++)
        tmp += iApt[i][j];
      
      System.out.println(i + 1 + "층:" + tmp + "명");
      tmp = 0;
    }
  }
  
  public static void method3()
  {
    // 배열 t 시계 방향으로 90도 회전하기
    
    /*
     * 1 1 1 1 1          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0   --->   1 1 1 1 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     */
    
    /*
     * 90도 회전하기
     * 1. t 배열의 90도 회전 상태를 rotate 배열에 저장한다.
     * 2. t 배열이 참조하는 값을 rotate 배열로 바꾼다.
     */
    
    int[][] t = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };
    
    for(int i = 0; i < t.length; i++)
    {
      for(int j = 0; j < t[0].length; j++)
        System.out.print(String.format("%3d", t[i][j]));

      System.out.println();
    }
    
    System.out.println();
    
    int[][] rotate = new int[5][5];
    
    for(int i = 0; i < rotate.length; i++)
      for(int j = 0; j < rotate[0].length; j++)
        if(j == 4 || i == 2)
          rotate[i][j] = 1;
    
    t = rotate;
   
    for(int i = 0; i < t.length; i++)
    {
      for(int j = 0; j < t[0].length; j++)
        System.out.print(String.format("%3d", t[i][j]));

      System.out.println();
    }

    
  }
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    method1();
    method2();
    method3();
  }
}
