package pkg_text_RPG;

public class MonEZ extends Monster
{
  private String Name;
  
  public MonEZ()
  {
    // TODO Auto-generated constructor stub
  }
  
  public MonEZ(String Name, int iHp, int iAtk, int iExp, int iGold, int iMaxHp)
  {
    super(iHp, iAtk, iExp, iGold, iMaxHp);
    this.Name = Name;
  }

  public String getName()
  {
    return Name;
  }
  public void setName(String name)
  {
    Name = name;
  }
  
  
}
