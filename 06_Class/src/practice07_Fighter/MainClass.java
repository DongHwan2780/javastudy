package practice07_Fighter;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    
    int hp1,hp2,atk1,atk2;
    hp1 = (int)(Math.random() * 100);
    hp2 = (int)(Math.random() * 100);
    atk1 = (int)(Math.random() * 10) + 1;
    atk2 = (int)(Math.random() * 10) + 1;
    
    Fighter fighter1 = new Fighter("에이", hp1, atk1);
    Fighter fighter2 = new Fighter("비", hp2, atk2);
    
    System.out.println("파이터이름: " + fighter1.getName() + " 체력: " + fighter1.getHp() + " 공격력: " + fighter1.getAtk());
    System.out.println("파이터이름: " + fighter2.getName() + " 체력: " + fighter2.getHp() + " 공격력: " + fighter2.getAtk());
    
    int iCnt = 0;
    while(true)
    {
      System.out.println();
      if(fighter1.getHp() <= 0 || fighter2.getHp() <= 0)
        break;
      
      if(iCnt % 2 == 0)
      {
        System.out.println(fighter1.getName() + "의 공격!");
        fighter1.Punch(fighter2);
      }
      else
      {
        System.out.println(fighter2.getName() + "의 공격!");
        fighter2.Punch(fighter1);
      }
      
      iCnt++;      
    }
  }

}
