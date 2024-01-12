package practice07_Fighter;

public class Fighter
{
  private String name;
  private int hp, atk;
  
  public Fighter()
  {
    // TODO Auto-generated constructor stub
  }
  public Fighter(String name, int hp, int atk)
  {
    super();
    this.name = name;
    this.hp = hp;
    this.atk = atk;
  }
  
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  
  public int getHp()
  {
    return hp;
  }
  public void setHp(int hp)
  {
    this.hp = hp;
  }
  
  public int getAtk()
  {
    return atk;
  }
  public void setAtk(int atk)
  {
    this.atk = atk;
  }
  
  public void Punch(Fighter fighter)
  {
    fighter.setHp(fighter.getHp() - this.getAtk());
    
    Math.max(fighter.getHp(), 0);
    
    System.out.println(fighter.getName() + "의 남은 체력:" + fighter.getHp());
  }
}
