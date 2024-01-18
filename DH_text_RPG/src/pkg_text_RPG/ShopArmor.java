package pkg_text_RPG;

import java.util.Scanner;

public class ShopArmor extends Shop
{
  public ShopArmor(Player player)
  {
    showMenu(player);
  }

  @Override
  public void showMenu(Player player)
  {
    Scanner sc = new Scanner(System.in);
    
    while(true)
    {
      consoleShopChild();
      int chooseNum = 0;
      chooseNum = sc.nextInt();
      
      switch (chooseNum)
      {
      case 1:
        break;
      case 2:
        randomBox(player);
        continue;
      case 3:
        return;
      default:
        System.out.println("다시 입력");
        continue;
      }
    }
  }
  
  @Override
  public void consoleShopChild()
  {
    System.out.println("------------------------------------------");
    System.out.println("1.방어구 구매 2.랜덤박스 3.나가기");
    System.out.println("------------------------------------------");
  }
}
