package db.main;

import java.util.List;

import db.ctrl.UserController;
import db.dao.UserDao;
import db.dto.UserDto;

public class MainClass
{

  public static void main(String[] args)
  {
      UserController userController = new UserController();
      System.out.println(userController.requestHandle("3", new UserDto(0, "테스트이름", "테스트연락처", null)));
    
      System.out.println(userController.requestHandle("1", null));
    
//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
//    UserDao userDao = UserDao.getInstance();
    
//    int result = userDao.insertUser(userDto);
//    System.out.println(result + " 행 이(가) 삽입되었습니다.");
    
//    List<UserDto> users = userDao.getUsers();
//    for(UserDto dt : users)
//      System.out.println(dt);
    
//    UserDto userDto = userDao.getUser(10);
//    System.out.println(userDto);
    
//    int result = userDao.modifyUser(new UserDto(3, "최동환", "010", null));
//    System.out.println(result + " 행 이(가) 수정되었습니다.");
//    
//    List<UserDto> users = userDao.getUsers();
//    for(UserDto dt : users)
//      System.out.println(dt);
    
//    int 인트 = 10;
//    System.out.println(인트);
  }

}
