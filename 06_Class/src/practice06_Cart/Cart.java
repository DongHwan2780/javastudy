package practice06_Cart;

public class Cart
{
  public final static int CART_SIZE = 10;
  private Product[] products;
  private int count;
  
  public Cart(int cartSize)
  {
    products = new Product[Math.min(CART_SIZE, cartSize)];
  }

  public Product[] getProducts()
  {
    return products;
  }
  public void setProducts(Product[] products)
  {
    this.products = products;
  }

  public int getCount()
  {
    return count;
  }
  public void setCount(int count)
  {
    this.count = count;
  }
  
  // 물건 담기
  public void addProduct(Product product)
  {
    if(count == products.length)
    {
      System.out.println("꽉 찼다");
      return;
    }
    
    
    if(product != null)
    {
      products[count++] = product;
      
    }
    else
    {
      System.out.println("물건이 없다");
      return;
    }
  }
  
  
  // 물건 바꾸기
  public void changeProduct(int idx, Product product)
  {
    if(count == 0)
    {
      System.out.println("카트가 비어있다");
      return;
    }   
    
    if(product == null)
    {
      System.out.println("바꿀 물건이 없다");
      return;
    }
    
    if(idx < 0 || idx >= products.length)
    {
      System.out.println("물건 번호가 잘못됨");
      return;
    }
    
    products[idx] = product;
  }
  // 물건 빼기
  public void removeProduct(int idx)
  {
    if(count == 0)
    {
      System.out.println("카트가 비어있다");
      return;
    }   
    
    if(idx < 0 || idx >= products.length)
    {
      System.out.println("물건 번호가 잘못됨");
      return;
    }
    
    /*
     *  물건이 5개(count)인 경우로 가정
     *  삭제할 idx     복사할 요소의 개수(count - idx - 1)
     *  0               4
     *  1               3
     *  2               2
     *  3               1
     *  4               0
     * */
    System.arraycopy(products, idx + 1, products, idx, count - idx - 1);
    
    count--;
  }
}
