package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dto.UserDto;


/*
 * DAO
 * 1. Database Access Object
 * 2. 데이터베이스에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받는 객체
 * 3. 하나의 객체만 만들어서 사용하는 Singleton Pattern 으로 DAO 객체를 생성한다.
 * */

/*
 * Singleton Pattern
 * 1. 오직 하나의 객체만 만들어서 사용하는 패턴
 * 2. 클래스 내부에서 객체를 미리 만든 뒤 해당 객체를 가져다 사용할 수 있도록 메소드를 
 * 3. 클래스 외부에서는 객체를 생성할 수 없도록 생성자를 private 처리한다.
 * */


public class UserDao {

  // Singleton Pattern
  private UserDao()
  {
    
  }
  
  private static UserDao userDao = new UserDao();
  
  public static UserDao getInstance()
  {
    return userDao;
  }
  
  // field
  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;

  
  // private 메소드 (UserDao 내부에서 호출하는 메소드)
  private void connection() {

    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
    } catch (ClassNotFoundException e) {
      System.out.println("OracleDriver 클래스 로드 실패");
    } catch (SQLException e) {
      System.out.println("데이터베이스 접속 실패");
    }
    
  }

  private void close() {
    try {
      if(rs != null) rs.close();
      if(ps != null) ps.close();
      if(con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 
  // public 메소드 (실제 기능을 담당하는 메소드)
  
  
  // 모든 사용자 조회 : getUserList, getUsers
  public List<UserDto> getUsers()
  {
    List<UserDto> dtoList = new ArrayList<UserDto>();
    
    try
    {
      connection();
      String sql = "SELECT USER_NO, USER_NAME, USER_TEL, JOIN_DT FROM USER_T ORDER BY USER_NO DESC";
      
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      
      while(rs.next())
      {
        UserDto dto = new UserDto();
        dto.setUser_num(rs.getInt(1));    // rs.getInt("USER_NO")
        dto.setUser_name(rs.getString(2));    // rs.getString("USER_NAME")
        dto.setUser_tel(rs.getString("USER_TEL"));
        dto.setJoin_dt(rs.getString("JOIN_DT"));
        
        dtoList.add(dto);
      }
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }finally
    {
      close();
    }
    
    return dtoList;
  }
  
  // 특정 사용자 조회 : getUser,User + By(조회할 특정 정보) 등
  public UserDto getUser(int userNum)
  {
    UserDto user = null;
    
    try
    {
      connection();
      String sql = "SELECT USER_NO, USER_NAME, USER_TEL, JOIN_DT FROM USER_T WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      ps.setInt(1, userNum);    // 1 == 몇번째 물음표인지 , userNum == 물음표에 어떤 값이 들어가는지
      rs = ps.executeQuery();
      
      if(rs.next())
      {
        user = new UserDto();
        user.setUser_num(rs.getInt(1));
        user.setUser_name(rs.getString(2));
        user.setUser_tel(rs.getString(3));
        user.setJoin_dt(rs.getString(4));
      }
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }finally
    {
      close();
    }
    
    return user;
  }
  
  // 사용자 등록 : insertUser, saveUser, registUser 등
  public int insertUser(UserDto user)
  {
    int result = 0;
    
    try
    {
      connection();
      String sql = "INSERT INTO USER_T (USER_NO, USER_NAME, USER_TEL, JOIN_DT) VALUES(USER_SEQ.NEXTVAL, ?, ?, TO_CHAR(CURRENT_DATE, 'YYYY-MM-DD'))";
      
      ps = con.prepareStatement(sql);
      ps.setString(1, user.getUser_name());
      ps.setString(2, user.getUser_tel());
      
      result = ps.executeUpdate();
    }catch(Exception e)
    {
      e.printStackTrace();
    }finally
    {
      close();
    }
    
    return result;
  }
  
  // 사용자 정보 수정 : updateUser, modifyUser 등
  public int modifyUser(UserDto user)   
  {
    int result = 0;
    
    try
    {
      connection();
      String sql = "UPDATE USER_T"
          + " SET USER_NAME = ?, USER_TEL = ?"
          + " WHERE USER_NO = ?";
      ps = con.prepareStatement(sql);
      
      ps.setString(1, user.getUser_name());
      ps.setString(2, user.getUser_tel());
      ps.setInt(3, user.getUser_num());
      
      result = ps.executeUpdate();
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }finally
    {
      close();
    }
    
    
    return result;
  }
  // 사용자 정보 삭제 : deleteUser, removeUser 등
  public int deleteUser(int userNum)
  {
    int result = 0;
    
    try
    {
      connection();
      String sql = "DELETE FROM USER_T WHERE USER_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, userNum);
      
      result = ps.executeUpdate();
      
    }catch(Exception e)
    {
      e.printStackTrace();
    }finally
    {
      close();
    }
    
    return result;  
  }
  
  
  
}