package pkg_text_RPG;

import java.util.Scanner;

public class Shop
{  
  private Item item;
  
  public Shop()
  {
  }
  public Shop(Scanner sc, Player player)
  {
    int shopNum;
    
    while(true)
    {
      consoleShop();
      shopNum = sc.nextInt();
      switch (shopNum)
      {
      case 1:
        new ShopWeapon(player);
        break;
      case 2:
        new ShopArmor(player);
        break;
      case 3:
        new ShopAccessory(player);
        break;
      case 4:
        return;
      default:
        System.out.println("올바른 번호 입력하세요");
        continue;   
      }
    }
  }

  public Item getItem()
  {
    return item;
  }
  public void setItem(Item item)
  {
    this.item = item;
  }
  
  public void randomBox(Player player)
  {
    double dPercent = Math.random() * 100 + 1;
    String itemGrade;
    int randomBoxPrice = 200;
    if(player.getiGold() >= randomBoxPrice )
    {
      System.out.println("랜덤박스 구매 완료");
      System.out.println("플레이어 소지금 차감" + player.getiGold() + "원 -> " + (player.getiGold() - randomBoxPrice) + "원");
      player.setiGold(player.getiGold() - randomBoxPrice);
      
      if(dPercent > 98)     
        itemGrade = "에픽 ";    //2
      else if(dPercent > 93)
        itemGrade = "전설 ";    // 5
      else if(dPercent > 80)
        itemGrade = "레어 ";    // 13
      else if(dPercent > 50)
        itemGrade = "매직 ";    // 30
      else  
        itemGrade = "일반 ";    // 50
      
      System.out.println(itemGrade + "아이템 획득!!");
      //player.setmInven(null);
    }
    else
      System.out.println("골드가 부족합니다.");
  }
  
  public void consoleShop()
  {
    System.out.println("-----------------------------------------------");
    System.out.println("1.무기상점 2.방어구상점 3.장신구상점 4.돌아가기");
    System.out.println("-----------------------------------------------");  
  }

  
  // 아래는 오버라이드할 함수들
  
  public void showMenu(Player player)
  {
  }
  public void consoleShopChild()
  {
  }
}
