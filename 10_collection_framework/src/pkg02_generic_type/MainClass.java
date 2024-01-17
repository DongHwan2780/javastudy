package pkg02_generic_type;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Container<Integer> container1 = new Container<Integer>();
    
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    Container<String> container2 = new Container<String>();
    container2.setItem("스트링");
    System.out.println(container2 .getItem());
  }

}
