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
  public void addProduct(Product product) throws RuntimeException
  {
    if(product != null)
      cList.add(product);
    else
      throw new RuntimeException("물건이 없다");
  }
  
  
  // 물건 바꾸기
  public void changeProduct(int idx, Product product) throws RuntimeException
  {
    if(cList.size() == 0)
      throw new RuntimeException("카트가 비어있다");
    
    if(product == null)
      throw new RuntimeException("물건이 없다");
    
    if(idx < 0 || idx >= cList.size())
      throw new RuntimeException("물건 번호가 잘못됨");
    
    cList.set(idx, product);
  }
  // 물건 빼기
  public void removeProduct(int idx) throws RuntimeException
  {
    if(cList.size() == 0)
      throw new RuntimeException("카트가 비어있다");
        
    
    if(idx < 0 || idx >= cList.size())
      throw new RuntimeException("물건 번호가 잘못됨");
    
    cList.remove(idx);
  }
}
