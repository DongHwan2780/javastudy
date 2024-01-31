package db.service;

import java.util.List;

import db.dto.UserDto;

public interface UserService
{
  List<UserDto> getUser();
  UserDto getUser(int usernum);
  int insertUser(UserDto user);
  int modifyUser(UserDto user);
  int deleteUser(int usernum);
  
}
