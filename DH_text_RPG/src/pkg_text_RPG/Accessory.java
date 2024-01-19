package pkg_text_RPG;

public class Accessory extends Item
{
  private String name;
  
  public Accessory(String name, int itemAtk, int itemDef, int itemHp, int itemMp)
  {
    super(itemAtk, itemDef, itemHp, itemMp);
    this.name = name;
  }
}
