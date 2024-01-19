package pkg_text_RPG;

public class Weapon extends Item
{
  private String name;

  public Weapon(String name, int itemAtk, int itemDef, int itemHp, int itemMp)
  {
    super(itemAtk, itemDef, itemHp, itemMp);
    this.name = name;
  }
  
  
}
