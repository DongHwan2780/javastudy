package pkg_01arithmetic;

public class MainClass 
{

  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    
    // 산술 연산
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    
    // 5 나누기 2의 연산 결과는 2.5가 아닌가
    // casting을 이용하면 원하는 결과를 얻을 수 있다.
    System.out.println((double)a / b);
    
    
    int x = 10;
    System.out.println(x++);    // x를 사용하고 1 증가 / 후위 연산
    System.out.println(x);
    
    int y = 10;
    System.out.println(++y);    // y를 1 증가시키고 사용 / 전위 연산
    System.out.println(y);
    
    
    int i = 10;
    System.out.println(i--);    // i를 사용하고 1 감소 / 후위 연산
    System.out.println(i);
    
    int j = 10;
    System.out.println(--j);    // j를 1 감소시키고 사용 / 전위 연산
    System.out.println(j);
    
    
    int iNum[] = {0,1,0,1};
    
    System.out.println(iNum[0]);
    System.out.println(iNum[1]);
    System.out.println(iNum[2]);
    System.out.println(iNum[3]);
    
    
  }

}
