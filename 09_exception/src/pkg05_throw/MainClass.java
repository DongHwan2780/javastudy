package pkg05_throw;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    /*
     *  throw
     *  1. 직접 예외 객체를 만들어서 던질 때 사용
     *  2. 자바가 자동으로 던지지 않는 예외들은 throw 문으로 직접 던져야 함
     * */
    
    try 
    {
      int score = 100;
      char grade;
      
      if(score < 0 || score > 100)
      {
        throw new RuntimeException();
      }
      
      if(score >= 90)
        grade = 'a';
      else if(score >= 80)
        grade = 'b';
      else if(score >= 70)
        grade = 'c';
      else if(score >= 60)
        grade = 'd';
      else
        grade = 'f';
      
      System.out.println("점수: " + score + " 성적: " + grade);
    }
    catch(Exception e)
    {
      System.out.println("잘못됨");
    }
  }

}
