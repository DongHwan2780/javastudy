package db.main;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
    UserDao userDao = UserDao.getInstance();
    
//    int result = userDao.insertUser(userDto);
//    System.out.println(result + " 행 이(가) 삽입되었습니다.");
    
//    List<UserDto> users = userDao.getUsers();
//    for(UserDto dt : users)
//      System.out.println(dt);
    
//    UserDto userDto = userDao.getUser(10);
//    System.out.println(userDto);
    
    int result = userDao.modifyUser(new UserDto(3, "최동환", "010", null));
    System.out.println(result + " 행 이(가) 수정되었습니다.");
    
    List<UserDto> users = userDao.getUsers();
    for(UserDto dt : users)
      System.out.println(dt);
    
//    int 인트 = 10;
//    System.out.println(인트);
  }

}
