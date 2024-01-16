package pkg_text_RPG;

import java.util.Scanner;

public class Shop
{  
  public Shop()
  {
    // TODO Auto-generated constructor stub
  }
  
  public Shop(Scanner sc)
  {
    int shopNum;
    shopNum = sc.nextInt();
    
    if(shopNum < 0 || shopNum > 3)
    {
      System.out.println("올바른 번호 입력하세요");
      return;
    }
    else
    {
      switch (shopNum)
      {
      case 1:
        new ShopWeapon();
      case 2:
        new ShopArmor();
      case 3:
        new ShopAccessory();
      default:
        return;
      }      
    }
    
  }
}
