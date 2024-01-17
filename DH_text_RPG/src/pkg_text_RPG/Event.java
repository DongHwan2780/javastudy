package pkg_text_RPG;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Event
{  
  Timer timer = new Timer();
  
  
  public void levelUp(Player player)
  {
    if(player.getiExp() >= player.getiMaxExp())
    {
      player.setiLevel(player.getiLevel() + 1);
      player.setiExp(player.getiExp() - player.getiMaxExp());
      player.setiMaxExp(player.getiMaxExp() * 2);
      
      player.setiMaxHp(player.getiMaxHp() + 20);
      player.setiMaxMp(player.getiMaxMp() + 20);
      
      player.setiHp(player.getiMaxHp());
      player.setiMp(player.getiMaxMp());
      
      player.setiAtk(player.getiAtk() + 10);
      player.setiDef(player.getiDef() + 5);
      System.out.println("레벨업했습니다. 축하축하!!");
      player.PlayerInfo();
    }
  }
  
  public void useSkill(Player player, int skillNum)
  {
   
  }
  
  public void battle(Player player, Monster monster)
  {
    

  }

  public void gameStart(Scanner sc)
  {

  }
  
  public void dungeon(Player player)
  {
    Monster monster = new Monster();
    TimerTask timertask = new TimerTask()
    {
      @Override
      public void run()
      {
        int iDice = (int)(Math.random() * 100) + 1;
        
        if(iDice <= 80)
        {
          System.out.println("던전 탐험 중..." + "경험치 1 획득..." + "골드 1 획득...");
          player.setiExp(player.getiExp() + 1);
          player.setiGold(player.getiGold() + 1);
          player.PlayerInfo();
        }
        else
        {
          timer.cancel();
          monster.CreateMonster(player);
        }
      }
    };
    timer.schedule(timertask, 0, 5000);
  }
  
  public void playerDeath(Player player)
  {
     System.out.println("사망했습니다. 경험치와 골드를 일정량 잃습니다.");
     player.setiGold(player.getiGold() - (player.getiGold() * (int)0.2));
     player.setiExp(player.getiExp() - (player.getiExp() * (int)0.2));
     System.out.println("체력과 마나를 회복합니다.");
     player.setiHp(player.getiMaxHp());
     player.setiMp(player.getiMaxMp());
  }
}
