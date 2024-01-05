package pkg04_looppractice;

import java.util.Arrays;
import java.util.List;

public class MainClass
{
  public static void method1()
  {
    //100 ~ 1 출력
    int n = 100;
    
    while(n > 0)
      System.out.println(n--);
    
  }
  
  public static void method2()
  {
    // 5 ~ 20 사이 모든 정수의 평균
    int iTotal = 0;
    int i = 5;
    
    while(i < 21)
    {
      iTotal += i;
      i++;
    }
    System.out.println(iTotal / 16);
  }
  
  public static void method3()
  {
    int dan = 3;
    
    for(int i = 0; i < 9; i++)
      System.out.println("3 * " + (i + 1) + " = " + dan * (i + 1));
  }
  
  public static void method4()
  {
    int iMoney = 0;
    int iCount = 0;
    while(true)
    {
      iMoney += 70;
      iCount++;
      
      if(iMoney >= 100000)
        break;
    }
    System.out.println(iCount + "회 누적금액: " + iMoney);
  }
  
  public static void method5()
  {
    for(int i = 1; i < 6; i++)
    {
      for(int j = 0; j < i; j++)
      {
        System.out.print("*");        
      }
      System.out.println(); 
    }
    
    System.out.println(); 
    
    for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 5 - i; j++)
      {
        System.out.print("*");        
      }
      System.out.println(); 
    }
    
  }

  
  public static void method6()
  {
    for(int i = 2; i < 10; i++)
    {
      for(int j = 1; j < 10; j++)
      {
        System.out.println(i + " x " + j + " = " +  i * j);
      }
    }
    
    outer:
    for(int i = 2; i < 10; i++)
    {
      //if(i == 6)
      //  break;
      
      for(int j = 1; j < 10; j++)
      {
        System.out.println(i + " x " + j + " = " +  i * j);
        
        if(i == 5 && j == 5)
          break outer;
      }
    }
  }
  
  public static void method7()
  {
    for(int i = 1; i < 10; i++)
    {
      for(int j = 2; j < 10; j++)
      {
        System.out.print(j + " x " + i + "  =  " +  i * j + "  ");
      }
      System.out.println();
    }
  }
  
  public static void method8()
  {
    for(int i = 1; i <= 5; i++)
    {
      for(int j = 1; j <= 5 - i; j++)
      {
        System.out.print("@");
      }
      
      for(int k = 6 - i; k <= i + 4; k++ )
      {
        System.out.print("*");
      }
      
      for(int l = 1; l <= 5 - i; l++)
      {
        System.out.print("@");
      }
      
      System.out.println();
    }
    
    System.out.println();
    
    for(int i = 1; i <= 5; i++)
    {
      for(int j = 1; j <= i - 1; j++)
      {
        System.out.print("@");
      }
      
      for(int k = i; k <= 10 - i; k++ )
      {
        System.out.print("*");
      }
      
      for(int l = 1; l <= i - 1; l++)
      {
        System.out.print("@");
      }
      
      System.out.println();
    }
  }
  
  
  public static void main(String[] args)
  {
    
    // TODO Auto-generated method stub
    //method3();
    //method4();
    //method5();
    //method6();
    //method7();
    method8();
    
    
    /*    
    String[] cars = {"hd", "bmw", "benz", "kia"};
    List<String> car_list = Arrays.asList(cars);
    
    System.out.println(cars);
    System.out.println(Arrays.toString(cars));
    System.out.println(cars[1]);
    */
    
  }

}
