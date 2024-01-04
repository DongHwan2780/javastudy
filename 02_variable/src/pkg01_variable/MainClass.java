package pkg01_variable;

public class MainClass 
{

  public static void main(String[] args) 
  {
    /*
     *  메모리
     * 
     *  1. 램(RAM)
     *  2. 자바 프로그램이 동작하기 위한 모든 것이 저장되는 장소
     *  3. 변수도 메모리에 생성된다.
     *  4. 1바이트마다 16진수로 된 고유의 번호를 부여해서 관리한다.
     *      1) 주소값
     *      2) 참조값
     *      3) 16진수 작성 예시 : 0x123abc456
     *               
     * */
    
    /*
     *  식별자의 이름 규칙
     *  1. Pascal Case : 각 단어의 첫 글자는 대문자, 나머지는 소문자(클래스)
     *  2. Camel case : Pascal Case와 동일하지만, 첫 글자는 소문자(메소드, 변수)
     *  3. Snake case : 각 단어 연결을 밑줄로 하는 것(상수)
     * */
    
    /*
     *  사용 가능한 식별자
     *  1. 영문
     *  2. 한글
     *  3. 숫자(숫자로 시작은 불가능)
     *  4. 특수문자(_, $)
     * */
    
    /*
     *  변수
     *  1. 어떤 값을 저장하기 위해 매모리에 할당된 저장소를 의미한다.
     *  2. 변수를 선언한 뒤 사용 가능
     *  3. 저장하려는 데이터의 종류에 따라 2가지로 구분
     *      1) 기본 자료형(타입)
     *        (1) 값 자체를 저장하는 RAW DATA 타입
     *        (2) 8가지 타입이 제공됨
     *          byte, short, int, long, float, double, char, boolean
     *      2) 참조 자료형(타입)
     *        (1) 값이 저장된 참조값을 저장하는 REFERENCE DATA 타입
     *        (2) 기본 자료형을 제외한 모든 데이터는 참조 자료형이다.
     * */
    
    
    // 변수 선언
    // byte : 1바이트 크기의 정수
    byte bTest = 127;   // -128 ~ 127
    System.out.println(bTest);
    
    // short : 2바이트 크기의 정수
    short sTest = 32765;    // -32768 ~ 32767
    System.out.println(sTest);
    
    // int : 4바이트 크기의 정수
    int iTest = 123;    // -21억 ~ 21억
    System.out.println(iTest);
    
    // long : 8바이트 크기의 정수
    long lTest= 200;
    //long lTest2 = 100000000000L;    // 뒤에 L을 붙여준다 -> 저장하는 변수가 long 타입임을 명시
    System.out.println(lTest);
    
    // float : 4바이트 크기의 실수
    float fTest = 1.2f;
    System.out.println(fTest);
    
    // double : 8바이트 크기의 실수
    double dTest = 1.1;
    System.out.println(dTest);
    
    // char : 2바이트 크기의 문자(1글자만 저장 가능)
    char cTest = '헉';
    System.out.println(cTest);
    
    /*
     *  이스케이프 시퀀스
     *  1. 역슬래시로 시작하는 특수 문자를 의미한다.
     *  2. 종류
     *    1) 줄 바꿈 : \n
     *    2) 탭 : \t
     *    3) 따옴표 
     *      (1) \'
     *      (2) \"
   *      4) 역슬래시 : \\
   *      
     * */
    
    
    // boolean : 논리값 (true , false)
    boolean isTest = true;
    System.out.println(isTest);
    
    /*
     *  변수의 스코프(scope)
     *  1. 변수의 가용 범위를 의미한다.
     *  2. 변수가 선언된 코드 블록 내에서만 사용할 수 있다.
     * */
    
    int x = 10;
    {
      System.out.println(x);
      
    }
    //System.out.println(x);
    
    /*
     *  상수
     *  1. Constant Variable
     *  2. 값을 바꿀 수 없는 변수
     *  3. 상수 선언 규칙
     *    1) final 키워드를 추가한다.
     *    2) 반드시 초기값을 지정한다.
     *    3) 관례상 대문자로 작성한다.
     * */
    
    final double PI = 3.141592;
    System.out.println(PI);
    
    /*
     *  String 클래스
     *  1. 문자열을 관리하는 클래스
     *  2. 문자열을 저장하는 타입으로 사용
     *  3. 참조 자료형이지만 마치 기본 자료형처럼 쉬운 사용을 제공한다.  
     * */
    
    String s = "hello world!";
    System.out.println(s);
    
    
  }

}
