package pkg08_this;

public class Computer
{
  String sModel;
  int iPrice;
  
  // this() : 생성자를 호출하는 것
  // this.멤버 : 멤버(필드,메소드)를 호출하는 것
  Computer()
  {
    this(null, 0);
  }
  
  Computer(String sModel)
  {
    this(sModel, 0);
  }
  
  Computer(String sModel, int iPrice)
  {
    this.sModel = sModel;
    this.iPrice = iPrice;
  }
  
  
   void showThis() {System.out.println(this);} // 현재 객체 메소드를 호출한 객체
  
   void showModel() {System.out.println(this.sModel);}
}
