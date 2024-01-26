package pkg01_lambda_expr;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    GasStation gs = new GasStation();
    
    gs.setTotalOil(1000);
    gs.setCargePerLiter(1500);
    
    gs.sellOil("모닝", 50);
    gs.sellOil("소나타", 100);
    
    System.out.println("totaloil" + gs.getTotalOil());
    System.out.println("earning" + gs.getEarning());
  }
}


