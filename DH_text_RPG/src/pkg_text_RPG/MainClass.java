package pkg_text_RPG;
import java.util.Scanner;

public class MainClass
{    
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Event event = new Event();
    Scanner sc = new Scanner(System.in);
    Player player = new Player(50, 30, 10, 5, 1, 0, 1000000, 0, 50, 30, 30);
    
    while(true)
    {
      consoleMain();
      int chooseNum = 0;
      Shop shop;
      chooseNum = sc.nextInt();
      
      switch (chooseNum)
      {
      case 1:
        event.dungeon(player);
        break;
      case 2:
        shop = new Shop(sc, player);
        break;
      case 3:
        player.PlayerInfo();
        break;
      case 4:
        System.out.println("게임 종료");
        return;
      default:
        System.out.println("다시 입력");
        continue;
      }
    }
  }
  
  public static void consoleMain()
  {
    System.out.println("------------------------------------------");
    System.out.println("1.던전입장 2.상점 3.캐릭터정보 4.게임종료");
    System.out.println("------------------------------------------");   
  }
}

