package pkg_text_RPG;

public class Shop
{  
  public Shop()
  {
    // TODO Auto-generated constructor stub
  }
  
  public Shop(int shopNum)
  {
    Shop shop;
    
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
        shop = new ShopWeapon();
      case 2:
        shop = new ShopArmor();
      case 3:
        shop = new ShopAccessory();
      default:
        return;
      }      
    }
    
  }
}
