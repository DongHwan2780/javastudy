package pkg01_extends;

// Class 자식 extends 부모
// Class 서브 extends 슈퍼

// 자식 is a 부모
// 자식 has a 부모

public class Ev extends Car
{
  public void charge()
  {
    //System.out.println(model);    // 부모의 private에는 접근 불가
    System.out.println(maker);
    System.out.println("충전");
  }
}
