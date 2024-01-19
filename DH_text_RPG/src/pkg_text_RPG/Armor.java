package pkg_text_RPG;

public class Armor extends Item
{
  private String name;
  
  public Armor(String name, int itemAtk, int itemDef, int itemHp, int itemMp)
  {
    super(itemAtk, itemDef, itemHp, itemMp);
    this.name = name;
  }
}
