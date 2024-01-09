package pkg02_parameter;

public class Adder
{
  void add(int... params)
  {
    int iTotal = 0;
    for(int param : params)
      iTotal+= param;
    
    System.out.println("합:" + iTotal);
  }
}
