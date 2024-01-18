package practice02_Cart;

import java.util.List;

public class Customer
{
  private int money;
  private Cart cart;
  public Customer()
  {
    // TODO Auto-generated constructor stub
  }
  public Customer(int money)
  {
    super();
    this.money = money;
  }
  
  public int getMoney()
  {
    return money;
  }
  public void setMoney(int money)
  {
    this.money = money;
  }
  
  public Cart getCart()
  {
    return cart;
  }
  public void setCart(Cart cart)
  {
    this.cart = cart;
  }
  
  
  public void addToCart(Product product) throws RuntimeException
  {
    cart.addProduct(product);
  }
  
  public void changeCart(int idx, Product product) throws RuntimeException
  {
    cart.changeProduct(idx, product);
  }
  public void removeCart(int idx) throws RuntimeException
  {
    cart.removeProduct(idx);
  }
  
  public String buy() throws RuntimeException
  {
    String receipt = "영수증\n";
    int total = 0;
    
    for(int i = 0, count = cart.getcList().size(); i < count; i++)
    {
      List<Product> cList = cart.getcList();
      Product product = cList.get(i);
      total += product.getPrice();
      
      if(money < total)
        throw new RuntimeException("금액이 부족합니다");
      
      receipt += product.getName();
      receipt += ".....";
      receipt += product.getPrice();
      receipt += "\n";   
    }
    // 구매 처리
    money -= total;
    
    receipt += "총 구매액....." + total + "\n";
    
    return receipt;
  }
}
