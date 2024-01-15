package pkg_text_RPG;

public class Player
{
  private int iHp, iMp, iAtk, iDef,iLevel, iExp, iGold, iAvoid ,iMaxHp, iMaxMp, iMaxExp;
  public String[] arrInventory, arrSkill, arrEquip;
  
  public Player()
  {
  }

  public Player(int iHp, int iMp, int iAtk, int iDef, int iLevel, int iExp, int iGold, int iAvoid, int iMaxHp, int iMaxMp, int iMaxExp)
  {
    super();
    this.iHp = iHp;
    this.iMp = iMp;
    this.iAtk = iAtk;
    this.iDef = iDef;
    this.iLevel = iLevel;
    this.iExp = iExp;
    this.iGold = iGold;
    this.iAvoid = iAvoid;
    this.iMaxHp = iMaxHp;
    this.iMaxMp = iMaxMp;
    this.iMaxExp = iMaxExp;
  }

  public int getiHp() {return iHp;}
  public void setiHp(int iHp) { this.iHp = iHp; }

  public int getiMp() { return iMp; }
  public void setiMp(int iMp){ this.iMp = iMp;}

  public int getiAtk() { return iAtk;}
  public void setiAtk(int iAtk) { this.iAtk = iAtk; }

  public int getiDef() { return iDef; }
  public void setiDef(int iDef) { this.iDef = iDef; }

  public int getiLevel() { return iLevel; }
  public void setiLevel(int iLevel) { this.iLevel = iLevel;}

  public int getiExp() {return iExp;}
  public void setiExp(int iExp) {this.iExp = iExp;} 
  public void gainExp(int iExp) {this.iExp += iExp;}

  public int getiGold() {return iGold;}
  public void setiGold(int iGold) { this.iGold = iGold;}

  public int getiAvoid() {return iAvoid;}
  public void setiAvoid(int iAvoid) {this.iAvoid = iAvoid;}

  public String[] getInvenStatus()
  {
    return arrInventory;
  }
  public void SetInventory(int idx, String sItemName)
  {
    arrInventory[idx] = sItemName;
  }
  
  public String[] getEquip()
  {
    return arrEquip;
  }
  public void setEquip(int idx, String sEquipName)
  {
    arrEquip[idx] = sEquipName;
  }

  public String[] getSkillInfo()
  {
    return arrSkill;
  }
  public void SetSkill(int idx, String sSkillName)
  {
    arrSkill[idx] = sSkillName;
  }

  public int getiMaxHp()
  {
    return iMaxHp;
  }
  public void setiMaxHp(int iMaxHp)
  {
    this.iMaxHp = iMaxHp;
  }

  public int getiMaxMp()
  {
    return iMaxMp;
  }
  public void setiMaxMp(int iMaxMp)
  {
    this.iMaxMp = iMaxMp;
  }

  public int getiMaxExp()
  {
    return iMaxExp;
  }
  public void setiMaxExp(int iMaxExp)
  {
    this.iMaxExp = iMaxExp;
  }

  public void PlayerInfo()
  {
    System.out.println("----------------------------------------");
    System.out.println("--------------플레이어정보--------------");
    System.out.println("레벨: " + this.iLevel);
    System.out.println("경험치: " + this.iExp + "/" + this.iMaxExp);
    System.out.println("HP: " + this.iHp + "/" + this.iMaxHp);
    System.out.println("MP: " + this.iMp + "/" + this.iMaxMp);
    System.out.println("공격력: " + this.iAtk);
    System.out.println("방어력: " + this.iDef);
    System.out.println("회피율: " + this.iAvoid);
    System.out.println("소지금: " + this.iGold);
    System.out.println("----------------------------------------");
  }
}
