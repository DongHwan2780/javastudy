package pkg_text_RPG;

public class Item
{
  private int iItemAtk, iItemDef, iItemHp, iItemMp;
  
  public Item()
  {
    // TODO Auto-generated constructor stub
  }
  public Item(int iItemAtk, int iItemDef, int iItemHp, int iItemMp)
  {
    super();
    this.iItemAtk = iItemAtk;
    this.iItemDef = iItemDef;
    this.iItemHp = iItemHp;
    this.iItemMp = iItemMp;
  }
  public int getiItemAtk()
  {
    return iItemAtk;
  }
  public void setiItemAtk(int iItemAtk)
  {
    this.iItemAtk = iItemAtk;
  }
  public int getiItemDef()
  {
    return iItemDef;
  }
  public void setiItemDef(int iItemDef)
  {
    this.iItemDef = iItemDef;
  }
  public int getiItemHp()
  {
    return iItemHp;
  }
  public void setiItemHp(int iItemHp)
  {
    this.iItemHp = iItemHp;
  }
  public int getiItemMp()
  {
    return iItemMp;
  }
  public void setiItemMp(int iItemMp)
  {
    this.iItemMp = iItemMp;
  }
  
  
}
