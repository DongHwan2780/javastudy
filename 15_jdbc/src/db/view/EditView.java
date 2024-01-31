package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class EditView implements View
{

  @Override
  public UserDto display()
  {
    String userNum = JOptionPane.showInputDialog("수정할 사용자 번호를 입력하세요");
    String userName = JOptionPane.showInputDialog("수정할 이름을 입력하세요");
    String userTel = JOptionPane.showInputDialog("수정할 번호를 입력하세요");
    
    return new UserDto(Integer.parseInt(userNum), userName, userTel, null);
  }

}
