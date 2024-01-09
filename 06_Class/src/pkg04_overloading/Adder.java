package pkg04_overloading;

public class Adder
{
  int add(int a, int b)
  {
    return a + b;
  }
  
  int add(int... params)
  {
    int iTotal = 0;
    for(int p : params)
      iTotal += p;
    
    return iTotal;
  }
  
  double add(double a, int b)
  {
    return a + b;
  }
  
  double add(double...params)
  {
    double iTotal = 0;
    for(double p : params)
      iTotal += p;
    
    return iTotal;
  }
}
