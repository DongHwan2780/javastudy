package pkg_text_RPG;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainClass
{    
  public static void main(String[] args)
  {
    Event event = new Event();
    Scanner sc = new Scanner(System.in);
    Shop shop = null;
    Player player = load("\\GDJ77\\javastudy\\DH_text_RPG\\Data\\PlayerData.dat");
    
    while(true)
    {
      consoleMain();
      switch (sc.nextInt())
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
        save(player);
        break;
      case 5:
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
    System.out.println("----------------------------------------------------");
    System.out.println("1.던전입장 2.상점 3.캐릭터정보 4.저장하기 5.게임종료");
    System.out.println("----------------------------------------------------");   
  }
  
  public static void save(Player player)
  {
    File dir = new File("\\GDJ77\\javastudy\\DH_text_RPG\\Data");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "PlayerData.dat");
    ObjectOutputStream oos  = null;
    
    try
    {
      oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(player);
      oos.close();
      
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static Player load(String src)
  {
    ObjectInputStream ois = null;
    File file = new File(src);
    Player player = null;
    //Player player = new Player(50, 30, 10, 5, 1, 0, 1000000, 0, 50, 30, 30);
    try
    {
      ois = new ObjectInputStream(new FileInputStream(file));
      
      Player p = (Player)ois.readObject();
      player = p;
      ois.close();
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }catch(ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    return player;
  }
  
}

