package practice02_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass2 {
  
  /*
   * TALK_T 테이블의 데이터를 TANK_NO의 내림차순으로 정렬한 뒤 11~20번째 행을 조회하여 List 에 저장하시오.
   * TALK_T 구조
   *    TALK_NO      NUMBER (PK)
   *    TALK_CONTENT VARCHAR2(1000 BYTE)
   *    TALK_USER    VARCHAR2(1000 BYTE)
   *    WRITTEN_AT   TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111
   */
  
  public static void method() {
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      conn = DriverManager.getConnection(url, user, password);
      
      // TALK_NO, TALK_CONTENT, TALK_USER
      String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
          + "  FROM (SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
          + "          FROM TALK_T)"
          + " WHERE RN BETWEEN ? AND ?";
      
      String sql2 = "SELECT * "
          + "  FROM (SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
          + "          FROM TALK_T)"
          + "WHERE RN BETWEEN ? AND ?";

      
      pstmt = conn.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.print("row1: ");
      int row1 = sc.nextInt();
      System.out.print("row2: ");
      int row2 = sc.nextInt();
      sc.close();
      
      pstmt.setInt(1, row1);
      pstmt.setInt(2, row2);
      
      rs = pstmt.executeQuery();
      
      List<TalkDto> talks = new ArrayList<TalkDto>();
      while (rs.next()) {
        
        TalkDto dto = new TalkDto();
        dto.setTalk_no(rs.getInt(1));
        dto.setTalk_content(rs.getString(2));
        dto.setTalk_user(rs.getString(3));
        dto.setWritten_at(rs.getTimestamp(4));
        
        talks.add(dto);
//        talks.add(dto.getTalk_no());
//        talks.add(dto.getTalk_content());
//        talks.add(dto.getTalk_user());
//        talks.add(dto.getWritten_at());
        
        
      }
      for(TalkDto dt : talks)
        System.out.println(dt);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      
      try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
        
      } catch (Exception e) {
        e.printStackTrace();
        
      }
    }
  }
  
  public static void main(String[] args) {
    method();
  }

}