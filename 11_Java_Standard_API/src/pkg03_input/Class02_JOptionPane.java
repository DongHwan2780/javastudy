package pkg03_input;

import javax.swing.JOptionPane;

public class Class02_JOptionPane
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    String name = JOptionPane.showInputDialog("이름");
    String strAge = JOptionPane.showInputDialog("나이");
    String strHeight = JOptionPane.showInputDialog("키");
    String strGender = JOptionPane.showInputDialog("성별");
    
    int age = Integer.parseInt(strAge);
    double height = Double.parseDouble(strHeight);
    char gender = strGender.charAt(0);
    
    JOptionPane.showMessageDialog(null, name + "," + age + "," + height + "," + gender);
  }

}
