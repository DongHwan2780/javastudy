package pkg03_return;
import javax.swing.JOptionPane;

public class Adder
{

  int add(int... params)
  {
    int iTotal = 0;
    for(int i = 0; i < params.length; i++)
      iTotal += params[i];
    
    JOptionPane aa = new JOptionPane();
    aa.showMessageDialog(null, "adder 함수 작동 성공");
    
    return iTotal; 
  }
}
