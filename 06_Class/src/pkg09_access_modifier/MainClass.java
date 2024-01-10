package pkg09_access_modifier;

public class MainClass
{

  public static void main(String[] args)
  {
    // computer
    Computer computer = new Computer("삼성", 400, new Calculator());
    
    
    // 필드로 값을 전달하는 메소드
    computer.setsModel("애플");
    computer.setiPrice(500);
    computer.setCalculator(new Calculator());
    // 필드에서 값을 가져오는 메소드
    System.out.println(computer.getsModel());
    System.out.println(computer.getiPrice());
    computer.getCalculator().add(1,2,3);
  }

}
