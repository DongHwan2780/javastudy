package db.ctrl;

import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

/*
 * Controller
 * 1. 사용자의 요청을 받는 영역
 * 2. 사용자에게 응답을 보내는 영역
 * 3. 요청에 따른 Service 를 실행하고 실행 결과를 응답
 * */


public class UserController
{
  private UserService userService;
  
  public UserController()
  {
    userService = new UserServiceImpl();
  }
  
  public String requestHandle(String choice, UserDto userDto)
  {
    String message = "";
    
    switch(choice)
    {
      case "1":
        for(UserDto user : userService.getUser())
          message += user.toString() + "\n";
        break;
      case "2":
        UserDto user = userService.getUser(userDto.getUser_num());
        if(user == null)
          message = "조회된 사용자 정보 없음";
        else
          message = user.toString();
        break;
      case "3":
        message = userService.insertUser(userDto) + "명의 정보가 등록되었습니다.";
        break;
      case "4":
        message = userService.modifyUser(userDto) + "명의 정보가 수정되었습니다.";
        break;
      case "5":
        message = userService.deleteUser(userDto.getUser_num()) + "명의 정보가 삭제되었습니다.";
        break;
    }
    
    return message;
  }
}
