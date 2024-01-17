package pkg_text_RPG;

import java.util.ArrayList;
import java.util.List;

public class Monster
{
  private int iHp, iAtk, iExp, iGold, iMaxHp;
  public final static int MAX_MONSTER = 3;
  private List<Monster> ezMon, nmMon, hdMon;
  
  public Monster()
  {
    
    // TODO Auto-generated constructor stub
  }
  public Monster(int iHp, int iAtk, int iExp, int iGold, int iMaxHp)
  {
    super();
    this.iHp = iHp;
    this.iAtk = iAtk;
    this.iExp = iExp;
    this.iGold = iGold;
    this.iMaxHp = iMaxHp;
  }

  public int getiHp()
  {
    return iHp;
  }
  public void setiHp(int iHp)
  {
    this.iHp = iHp;
  }
  
  public int getiAtk()
  {
    return iAtk;
  }
  public void setiAtk(int iAtk)
  {
    this.iAtk = iAtk;
  }
  
  public int getiExp()
  {
    return iExp;
  }
  public void setiExp(int iExp)
  {
    this.iExp = iExp;
  }
  
  public int getiGold()
  {
    return iGold;
  }
  public void setiGold(int iGold)
  {
    this.iGold = iGold;
  }
  
  public int getiMaxHp()
  {
    return iMaxHp;
  }
  public void setiMaxHp(int iMaxHp)
  {
    this.iMaxHp = iMaxHp;
  }
  
  public static int getMaxMonster()
  {
    return MAX_MONSTER;
  }

  public void CreateMonster(Player player)
  {
    switch (player.getiLevel())  
    {
    case 1,2,3,4,5:
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("------------초급 던전 입장------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      geneMonster(player);
    break;
    case 6,7,8,9,10:
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("------------중급 던전 입장------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      geneMonster(player);
    break;
    case 11,12,13,14,15:
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("------------고급 던전 입장------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");
      geneMonster(player);
    break;
    default:
      return;
    }
  }
  
  public void geneMonster(Player player)
  {
    int iCountMon = (int)(Math.random() * MAX_MONSTER) + 1;
    ezMon = new ArrayList<Monster>();
    
    switch (player.getiLevel())
    {
    case 1,2,3,4,5:
    {
      for(int i = 0; i < iCountMon; i++)
      {
        iHp = (int)(Math.random() * 30) + 15;
        iAtk = (int)(Math.random() * 5) + 1;
        iExp = (int)(Math.random() * 10) + 1;
        iGold = (int)(Math.random() * 10) + 1;
        iMaxHp = iHp;
        
        ezMon.add(new MonEZ("초급", iHp, iAtk, iExp, iGold, iMaxHp));
      }
      showBattleInfo(player);
    }
    break;
    case 6,7,8,9,10:
    {
      for(int i = 0; i < iCountMon; i++)
      {
        iHp = (int)(Math.random() * 50) + 30;
        iAtk = (int)(Math.random() * 15) + 10;
        iExp = (int)(Math.random() * 20) + 10;
        iGold = (int)(Math.random() * 20) + 10;
        iMaxHp = iHp;
        
        nmMon.add(new MonEZ("중급", iHp, iAtk, iExp, iGold, iMaxHp));
      }      
    }
    break;
    case 11,12,13,14,15:
    {
      for(int i = 0; i < iCountMon; i++)
      {
        iHp = (int)(Math.random() * 100) + 50;
        iAtk = (int)(Math.random() * 50) + 30;
        iExp = (int)(Math.random() * 50) + 30;
        iGold = (int)(Math.random() * 50) + 30;
        iMaxHp = iHp;
        
        hdMon.add(new MonEZ("고급", iHp, iAtk, iExp, iGold, iMaxHp));
      }      
    }
    break;
    default:
      return;
    }
  }

  public void showBattleInfo(Player player)
  {
    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    System.out.println("--------------몬스터정보--------------");      
    for(int i = 0, size = ezMon.size(); i < size; i++)
    {
      System.out.print("이름: " + ((MonEZ)ezMon.get(i)).getName() + (i + 1) + "  ");
      System.out.print("HP: " + ezMon.get(i).getiHp() + "/" + ezMon.get(i).getiMaxHp() + "  ");
      System.out.println("공격력: " + ezMon.get(i).getiAtk());
    }
    System.out.println();
    
    if(true)        // 공격자 알려줄거
      System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑공격↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    else
      System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓공격↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    
    System.out.println();  
    
    System.out.println("--------------플레이어정보-------------");
    System.out.print("레벨: " + player.getiLevel() + "  ");
    System.out.print("경험치: " + player.getiExp() + "/" + player.getiMaxExp() + "  ");
    System.out.println("소지금: " + player.getiGold());
    System.out.print("HP: " + player.getiHp() + "/" + player.getiMaxHp() + "  ");
    System.out.print("MP: " + player.getiMp() + "/" + player.getiMaxMp() + "  ");
    System.out.print("공격력: " + player.getiAtk() + "  ");
    System.out.println("방어력: " + player.getiDef());
    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
  }
}
