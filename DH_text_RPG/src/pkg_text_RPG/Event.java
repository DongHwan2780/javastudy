package pkg_text_RPG;

public class Event
{  
  public void levelUp(Player player)
  {
    if(player.getiExp() >= player.getiMaxExp())
    {
      player.setiLevel(player.getiLevel() + 1);
      player.setiExp(player.getiExp() - player.getiMaxExp());
      player.setiMaxExp(player.getiMaxExp() * 2);
      
      player.setiMaxHp(player.getiMaxHp() + 20);
      player.setiMaxMp(player.getiMaxMp() + 20);
      
      player.setiHp(player.getiMaxHp());
      player.setiMp(player.getiMaxMp());
      
      player.setiAtk(player.getiAtk() + 10);
      player.setiDef(player.getiDef() + 5);
      System.out.println("레벨업했습니다. 축하축하!!");
      player.PlayerInfo();
    }
  }
  
  public void useSkill(Player player, int skillNum)
  {
   
  }
  
  public void battle(Player player, Monster monster)
  {
    
  }
  
  public void battleGroup(Player player, GroupMonster grmonster)
  {
    
  }
}
