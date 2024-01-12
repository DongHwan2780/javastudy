package pkg07_polymorphism;

public class Person
{
  public void powerOn(Elec elec)    // 부모 객체를 매개변수로 넘겨주면 업캐스팅 -> 다운 캐스팅을 통해 자식 객체 사용 가능
  {
    // Elec elec = new Tv() 또는 Elec elec = new Radio()
    
    
    // 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가될 때마다 코드의 추가가 필요 -> 추천X
    
    
    /*
    if(elec instanceof Tv)
      ((Tv) elec).powerOn();
    else if(elec instanceof Radio)
      ((Radio) elec).powerOn(); 
    */    
    
    // 2. Elec에 powerOn()메소드를 추가하고 Tv나 Radio가 오버라이드 하기
    
    elec.powerOn();
  }
}
