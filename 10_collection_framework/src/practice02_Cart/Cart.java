package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
  private List<Product> cList;
  private int count;
  
  public Cart(int cartSize)
  {
    cList = new ArrayList<Product>(cartSize);
  }

  public List<Product> getcList()
  {
    return cList;
  }
  public void setcList(List<Product> cList)
  {
    this.cList = cList;
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
    if(cList.size() == 10)
    {
      System.out.println("꽉 찼다");
      return;
    }
    
    if(product != null)
    {
      cList.add(product);
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
    if(cList.size() == 0)
    {
      System.out.println("카트가 비어있다");
      return;
    }   
    
    if(product == null)
    {
      System.out.println("바꿀 물건이 없다");
      return;
    }
    
    if(idx < 0 || idx >= cList.size())
    {
      System.out.println("물건 번호가 잘못됨");
      return;
    }
    
    cList.set(idx, product);
  }
  // 물건 빼기
  public void removeProduct(int idx)
  {
    if(cList.size() == 0)
    {
      System.out.println("카트가 비어있다");
      return;
    }   
    
    if(idx < 0 || idx >= cList.size())
    {
      System.out.println("물건 번호가 잘못됨");
      return;
    }
    
    cList.remove(idx);
  }
}
