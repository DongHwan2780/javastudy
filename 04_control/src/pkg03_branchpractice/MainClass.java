package pkg03_branchpractice;

public class MainClass
{
  public static void method1()
  {
    int month = 7;
    
    if(month == 12 || month == 1 || month == 2)
      System.out.println("겨울");
    else if(month == 3 || month == 4 || month == 5)
      System.out.println("봄");
    else if(month == 6 || month == 7 || month == 8)
      System.out.println("여름");
    else
      System.out.println("가을");
  }
  
  public static void method2()
  {
    int score = 60;
    int grade = 4;
    
    if(grade == 1 || grade == 2 || grade == 3)
    {
      if(score >= 60)
        System.out.println("합격");
      else
        System.out.println("불합격");
    }
    else
    {
      if(score >= 70)
        System.out.println("합격");
      else
        System.out.println("불합격");
    }
    
  }
  
  public static void method3()
  {
    int day = 4;
    int nDay = 10;
    String weekName;
    
    if(nDay % 7 == 0)
      weekName = "목요일";
    else if(nDay % 7 == 1)
      weekName = "금요일";
    else if(nDay % 7 == 2)
      weekName = "토요일";
    else if(nDay % 7 == 3)
      weekName = "일요일";
    else if(nDay % 7 == 4)
      weekName = "월요일";
    else if(nDay % 7 == 5)
      weekName = "화요일";
    else
      weekName = "수요일";
    
    System.out.println(weekName);
    
  }
  
  public static void method4()
  {
    String order = "카페라떼";
    int price = 0;
    
    switch(order)
    {
      case "아메리카노":
        price = 1000;
        break;
      case "카페라떼" : 
        price = 2000;
        break;
      case "밀크티": 
        price = 3000;
        break;
      default : 
        price = 5000;
        break;
    }
    
    System.out.println(price);
 
  }
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    method4();

  }

}
