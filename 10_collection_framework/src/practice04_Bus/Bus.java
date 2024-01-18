package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus
{
  private List<Seat> seats;
  public static final int LIMIT = 25;
  private int idx;
  
  public Bus()
  {
     seats = new ArrayList<Seat>(LIMIT);
     for(int i = 0; i < LIMIT; i++)
       seats.add(new Seat());
  }
  
  public void on(Person person) throws RuntimeException
  {
    if(idx >= LIMIT) 
      throw new RuntimeException("만석입니다. 버스에 탈 수 없습니다.");
    
    for(int i = 0; i < LIMIT; i++) {
      if(seats.get(i).getPerson() == null) {        
        seats.get(i).setPerson(person);
        idx++;
        break;
      }
    }
  }
  
  public void off(int idx) throws RuntimeException
  {
    if(idx <= 0 || idx > LIMIT) 
      throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
    
    seats.get(idx - 1).setPerson(null);
    this.idx--;
  }
  
  public void info()
  {
    System.out.println("===== 탑승자 목록 확인 =====");
    for(int i = 0; i < LIMIT; i++) {
      // 각 좌석에 앉아 있는 사람
      Person person = seats.get(i).getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
  }
  
}
