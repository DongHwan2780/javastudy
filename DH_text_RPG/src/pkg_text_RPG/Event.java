package pkg_text_RPG;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Event
{  
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
    Scanner sc = new Scanner(System.in);
    int battleCnt = 1;
    int targetNum = 0;
    int gainExp = 0;
    int gainGold = 0;
    
    while(true) 
    {
      monster.showBattleInfo(player, (monster.getEzMon().size() + 1) % battleCnt);
      
      if(monster.getEzMon().size() > 1)
      {
        System.out.println("몇 번째 몬스터를 공격할까요?");
        targetNum = sc.nextInt();
        sc.close();
        System.out.println("플레이어가 " + targetNum + "번째 몬스터 공격!");
        monster.getEzMon().get(targetNum - 1).setiHp(monster.getEzMon().get(targetNum - 1).getiHp() - player.getiAtk());
        battleCnt++;
        
        if(monster.getEzMon().get(targetNum - 1).getiHp() <= 0)
        {
          gainExp += monster.getEzMon().get(targetNum - 1).getiExp();
          gainGold += monster.getEzMon().get(targetNum - 1).getiGold();
          monster.getEzMon().remove(targetNum - 1);
        }
      }
      else
      {
        System.out.println("플레이어가 공격!");
        monster.getEzMon().get(0).setiHp(monster.getEzMon().get(0).getiHp() - player.getiAtk());       
        battleCnt++;
        
        if(monster.getEzMon().get(0).getiHp() <= 0)
        {
          gainExp += monster.getEzMon().get(0).getiExp();
          gainGold += monster.getEzMon().get(0).getiGold();
          monster.getEzMon().remove(0);
        }
      }
      
      for(int i = 0, size = monster.getEzMon().size(); i < size; i++)
      {
        if(player.getiDef() >= monster.getEzMon().get(i).getiAtk())
          player.setiHp(player.getiHp() - 1);
        else
          player.setiHp(player.getiHp() - (monster.getEzMon().get(i).getiAtk() - player.getiDef()));
        
        System.out.println("몬스터가 공격!");
        battleCnt++;
      }
      
      
      if(monster.getEzMon().size() == 0)
      {
        System.out.println("전투에서 승리했습니다");
        System.out.println("전투에서 획득한 경험치: " + gainExp + " 획득한 골드: " + gainGold);
        player.setiExp(player.getiExp() + gainExp);
        player.setiGold(player.getiGold() + gainGold);
        gainExp = 0;
        gainGold = 0;
        battleCnt = 0;
        player.PlayerInfo();
        return;
      }
    }
  }

  public void gameStart(Scanner sc)
  {

  }
  
  public void dungeon(Player player)
  {
    Monster monster = new Monster();
    Timer timer = new Timer();
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
