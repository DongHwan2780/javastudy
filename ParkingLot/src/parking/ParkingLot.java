package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  /* field 영역 수정 금지 */
  private String name;
  private List<Car> cars;
  private Scanner sc;
  public final static int LIMIT = 5;
  
  public ParkingLot(String name) {
    /* 구현부 */
    cars = new ArrayList<Car>();
    sc = new Scanner(System.in);
    this.name = "";
  }
  
  public void addCar() throws RuntimeException {
    /* 구현부 */
    if(cars.size() == LIMIT)
    {
      System.out.println("현재 등록된 차량 :" + cars.size() + "대");
      System.out.println("만차입니다. 더 이상 차량 등록이 불가능합니다.");
      return;
    }
    else
    {
      
      System.out.println("현재 등록된 차량:" + cars.size() + "대");
      System.out.println("차량번호 입력 >>>");
      name = sc.next();
      System.out.println("모델 입력 >>>");
      
      cars.add(new Car(name, sc.next()));
      System.out.println("차량번호 " + name + "차량이 등록되었습니다.");
    }
  }
  
  public void deleteCar() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty())
    {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    
    System.out.println("삭제할 차량번호 입력 >>>");
    name = sc.next();
    
    for(int i = 0, size = cars.size(); i < size; i++)
    {
      if(name.equals(cars.get(i).getCarNo()))
      {
        System.out.println("차량번호 " + cars.get(i).getCarNo() + "차량이 삭제되었습니다.");
        cars.remove(i);
        return;
      }
    }
    
    for(Car c : cars)
    {
      if(!name.equals(c.getCarNo()))
        System.out.println("차량번호 " +  name + "차량이 존재하지 않습니다.");
    }
  }
  
  public void searchCar() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty())
    {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    
    System.out.println("조회할 차량번호 입력 >>>");
    name = sc.next();
    
    for(Car c : cars)
    {
      if(!name.equals(c.getCarNo()))
      {
        System.out.println("차량번호 " +  name + "차량이 존재하지 않습니다.");
      }
      else
      {
        System.out.println("차량번호 " + c.toString());
        break;       
      }
    }
  }
  
  public void printAllCars() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty())
    {
      System.out.println("현재 주차장에 등록된 차량이 없습니다.");
      return;
    }
    
    System.out.println("대박주차장 차량 목록");
    
    for(int i = cars.size(); i < LIMIT; i++ )
      cars.add(new Car());
    
    for(int i = 0; i < LIMIT; i++)
    {
      if(cars.get(i).getCarNo() == null)
        System.out.println( (i + 1)+ "번째 차량: 없음");
      else
        System.out.println( (i + 1)+ "번째 차량: " + cars.get(i).toString());
    }

  }
  
  public void manage() {
    /* 구현부 */
    while(true)
    {
      System.out.println("1.추가 2.삭제 3.조회 4.전체조회 0.종료");
      
      switch(sc.nextInt())
      {
      case 1:
        addCar();
        break;
      case 2:
        deleteCar();
        break;
      case 3:
        searchCar();
        break;
      case 4:
        printAllCars();
        break;
      case 0:
        System.out.println("종료");
        return;
       default:
         System.out.println("다시 입력");
      }
    }
  }
  
}