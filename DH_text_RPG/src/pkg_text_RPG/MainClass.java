package pkg_text_RPG;

public class MainClass
{    
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Player player = new Player(50, 30, 10, 5, 1, 0, 0, 0, 50, 30, 30);
    Event event = new Event();
    
    player.PlayerInfo();
    System.out.println();
    player.gainExp(50);
    event.levelUp(player);

  }

}

