package pkg05_etc;

import java.text.DecimalFormat;

public class Class03_DecimalFormat
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    double number = 12345.456;
    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    System.out.println(df.format(number));
  }

}
