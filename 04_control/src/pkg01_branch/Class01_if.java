package pkg01_branch;

public class Class01_if 
{
  public static void method1()
  {
    /*
     *  if
     *  1. 조건식을 만족하는 경우에만 실행한다.
     *  2. 실행문은 중괄호 {}로 묶는다.
     *  3. 실행문이 하나인 경우 중괄호 {}는 생략할 수 있다.
     * */
    
    int n = 4;
    
    if(n % 3 == 0)
      System.out.println("3의 배수");
    
    if(n % 3 != 0)
      System.out.println("3의 배수 아님");   
  }
  
  public static void method2()
  {
    /*
     *  else if
     *  1. if 이후에 추가 가능한 선택 구문
     *  2. if로 처리하지 못한 대상들에 새로운 조건식을 지정할 수 있다.
     *  3. 원하는 만큼 계속 추가할 수 있다.
     * */
    
    int age = 15;
    
    if(age <= 7)
      System.out.println("미취학아동");
    else if (age <= 13)
      System.out.println("초등학생");
    else if (age <= 16)
      System.out.println("중학생");
    else if (age <= 19)
      System.out.println("고등학생");
    
  }
  
  public static void method3()
  {
    /*
     *  else
     *  1. if 또는 else if 이후 마지막에 한 번 나타날 수 있는 선택 구문
     *  2. 지금까지 작성된 모든 조건을 만족하지 않을 때
     * */
    int age = 13;
    
    if(age < 0 || age > 120)
      System.out.println("잘못된 나이");
    else
    {
      if(age <= 7)
        System.out.println("미취학아동");
      else if (age <= 13)
        System.out.println("초등학생");
      else if (age <= 16)
        System.out.println("중학생");
      else if (age <= 19)
        System.out.println("고등학생");
      else
        System.out.println("성인");      
    }
    
  }
  
  public static void method4()
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
  
  public static void method5()
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
  
  public static void method6()
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
  
  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    method4();
    method5();
    method6();
  }

}
