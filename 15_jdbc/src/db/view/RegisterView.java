package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class RegisterView implements View
{

  @Override
  public UserDto display()
  {
    String userName = JOptionPane.showInputDialog("등록할 이름을 입력하세요");
    String userTel = JOptionPane.showInputDialog("등록할 번호를 입력하세요");
    
    return new UserDto(0, userName, userTel, null);
  }

}
