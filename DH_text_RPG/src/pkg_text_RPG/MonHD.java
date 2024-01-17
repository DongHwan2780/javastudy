package pkg_text_RPG;

public class MonHD extends Monster
{
  private String Name;
  
  public MonHD()
  {
    // TODO Auto-generated constructor stub
  }
  
  public MonHD(String Name, int iHp, int iAtk, int iExp, int iGold, int iMaxHp)
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
