package pkg_text_RPG;

public class MonNM extends Monster
{
  private String Name;
  
  public MonNM()
  {
    // TODO Auto-generated constructor stub
  }
  
  public MonNM(String Name, int iHp, int iAtk, int iExp, int iGold, int iMaxHp)
  {
    super(iHp, iAtk, iExp, iGold, iMaxHp);
    this.Name = Name;
  }
}
