package practice06_Cart;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
     Customer customer = new Customer(10000);
     Cart cart = new Cart(5);
     
     // 고객이 카트 가짐
     customer.setCart(cart);
     
     customer.addToCart(new Product("홈런볼", 3000));
     customer.addToCart(new Product("썬칩", 2000));
     customer.addToCart(new Product("맛동산", 5000));
     
     customer.changeCart(1, new Product("치토스", 1000));
     
     customer.removeCart(0);
     
     String receipt = customer.buy();
     
     System.out.println(receipt);
     System.out.println("고객이 가진 돈: " + customer.getMoney());
     
  }

}
