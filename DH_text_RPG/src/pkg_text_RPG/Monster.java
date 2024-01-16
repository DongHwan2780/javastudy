package pkg_text_RPG;

public class Monster
{
  private int iHp, iAtk, iExp, iGold, iMaxHp;
  public final static int MAX_MONSTER = 3;
  
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
      System.out.println("---------초급 던전 입장---------");
      geneMonster(player.getiLevel());
    break;
    case 6,7,8,9,10:
      System.out.println("---------중급 던전 입장---------");
      geneMonster(player.getiLevel());
    break;
    case 11,12,13,14,15:
      System.out.println("---------고급 던전 입장---------");
      geneMonster(player.getiLevel());
    break;
    default:
      return;
    }
  }
  
  public void geneMonster(int playerlev)
  {
    iHp = (int)(Math.random() * 30) + 1;
    iAtk = (int)(Math.random() * 10) + 1;
    iExp = (int)(Math.random() * 10) + 1;
    iGold = (int)(Math.random() * 10) + 1;
    iMaxHp = iHp;
      
  }
  
}
