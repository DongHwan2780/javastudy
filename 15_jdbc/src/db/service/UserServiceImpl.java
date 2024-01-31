package db.service;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

/*
 * Business Layer
 * 1. 핵심 로직을 처리하는 부분
 * 2. Persistance Layer 와 통신하는 레이어이다.
 * 
 * */


public class UserServiceImpl implements UserService
{
  private UserDao userDao;
  
  public UserServiceImpl()
  {
    userDao = UserDao.getInstance();
  }
  
  
  @Override
  public List<UserDto> getUser()
  {
    // TODO Auto-generated method stub
    return userDao.getUsers();
  }

  @Override
  public UserDto getUser(int usernum)
  {
    // TODO Auto-generated method stub
    return userDao.getUser(usernum);
  }

  @Override
  public int insertUser(UserDto user)
  {
    // TODO Auto-generated method stub
    return userDao.insertUser(user);
  }

  @Override
  public int modifyUser(UserDto user)
  {
    // TODO Auto-generated method stub
    return userDao.modifyUser(user);
  }

  @Override
  public int deleteUser(int usernum)
  {
    // TODO Auto-generated method stub
    return userDao.deleteUser(usernum);
  }

}
