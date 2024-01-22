package practice01;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class MainClass
{

   //파일명 만들기
  // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
  public static void method1()
  {
    String fileName = "apple.jpg";
    String extName = fileName.substring(fileName.lastIndexOf("."));
    StringBuilder sb = new StringBuilder();
    long timestamp = System.currentTimeMillis();
    sb.append(UUID.randomUUID().toString().replace("-", ""));    
    sb.append("_");
    sb.append(timestamp);
    sb.append(extName);
    System.out.println(sb.toString());
  }
  
  
  public static Map<String,Object> method2(String id)
  {
    // 나이 구하기 + 성별 구하기
    // 나이 : 현재년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1,3이면 남자 2,4면 여자
    Map<String,Object> m = new HashMap<String, Object>();
    
    LocalDateTime now = LocalDateTime.now();
    int year = now.getYear();
    int age = year - Integer.parseInt("20" + id.substring(0, 2));
    
    String temp = id.substring(id.indexOf("-") + 1);
    String gender = "";
    
    if(temp.charAt(0) == '1' || temp.charAt(0) == '3')
      gender = "남";
    else if(temp.charAt(0) == '2' || temp.charAt(0) == '4')
      gender = "여";
    else
      gender = "잘못된 주민번호임";
      
    m.put("나이", age);
    m.put("성별", gender);
    
    return m;
  }
  public static void method3() {
    
    // 각 나라별 수도 맞히기
  Map<String, String> map = Map.of("프랑스", "파리" , "독일", "베를린", "이탈리아", "로마", "스위스", "베른", "영국", "런던");
    Scanner sc = new Scanner(System.in);
    String answer;
    int cnt = 0;
    Set<Entry<String, String>> maps = map.entrySet();
    
    for(Entry<String, String> ent : maps)
    {
      System.out.println(ent.getKey() + "수도는? >>>");
      answer = sc.next();
      if(answer.equals(ent.getValue()))
        cnt++;
    }
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> s
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
    System.out.println(cnt + "개 정답 성공");
  }
  
  public static void method4() {

    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    // 실행예시)
    // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
    // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
    // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
    // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
  
    int ibalance = 5000;
    int cnt = 1;
    
    while(ibalance > 0)
    {
      int rand;
      if(cnt == 1)
        rand = (int)(Math.random() * 5000) + 1;
      else
        rand = (int)(Math.random() * ibalance) + 1;
      
      System.out.println("출금 전: " + ibalance + "원 " + cnt + "회 " + "출금액: " + rand + "원 " + "출금 후: " + (ibalance - rand) + "원");
      cnt++;
      ibalance -= rand;
      
      if(ibalance <= 0)
        return;
    }
  }
  
  public static void method5() {

    // 윷놀이
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.
    
    String[] yuts = {"", "도", "개", "걸", "윷", "모"};
    List<String> sList = new ArrayList<String>();
    int cnt = 0;
    int rand;
    
    while(true)
    {
      rand = (int)(Math.random() * 5) + 1;
      
      switch (rand)
      {
      case 1:
        sList.add(yuts[rand]);
        cnt += rand;
        break;
      case 2:
        sList.add(yuts[rand]);
        cnt += rand;
        break;
      case 3:
        sList.add(yuts[rand]);
        cnt += rand;
        break;
      case 4:
        sList.add(yuts[rand]);
        cnt += rand;
        break;
      case 5:
        sList.add(yuts[rand]);
        cnt += rand;
        break;
      }
      
      if(rand < 4)
        break;
    }
    
    for(String s : sList)
      System.out.print(s + ", ");
    
    System.out.println(cnt + "칸 이동한다");
    
  }

  public static void method6() {
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
//    48 57
//    65 90
//    97 122
    
    Scanner sc = new Scanner(System.in);
    System.out.println("몇 자리의 인증번호를 생성할까요? >>>");
    int size = sc.nextInt();
    SecureRandom sr = new SecureRandom();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < size; i++)
    {
      int rand = sr.nextInt(3) + 1;
      
      if(rand == 1)
        sb.append((char)('0' + (sr.nextInt(10))));
      else if(rand == 2)
        sb.append((char)('a' + (sr.nextInt(26))));
      else
        sb.append((char)('A' + (sr.nextInt(26))));
    }
     System.out.print(sb.toString());

  }

  public static void method7() {

    // UpDown 게임
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    int cnt = 0;
    int rand  = (int)(Math.random() * 10000) + 1;
    Scanner sc = new Scanner(System.in);
    int tmp = 0;
    
    while(true)
    {
      System.out.println("입력 >>>");
      tmp = sc.nextInt();
      
      if(tmp > rand)
      {
        System.out.println("Down!");
        cnt++;
      }
      else if(tmp < rand)
      {
        System.out.println("Up!");
        cnt++;
      }
      else
      {
        System.out.println("정답입니다. 총" + cnt + "번만에 성공했습니다.");
        break;
      }
    }
    
  }

  public static void method8() {

    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
    
    int[] arr = new int[10];
    
    for(int i = 0; i < 100; i++)
    {
      int rand = (int)(Math.random() * 10);
      arr[rand] += 1;
    }
    
    for(int i = 0, size = arr.length; i < size; i++)
    {
      int cnt2 = arr[i];
      System.out.print(i + ":");
      for(int j = 0, size2 = arr[i]; j < size2; j++)
        System.out.print("#");
      
      System.out.print(" " + cnt2);
      System.out.println();
    }
    
  }
  
  public static void method9() {
    
    int[][] bingo = new int[5][5];
    List<Integer> iList = new ArrayList<Integer>();
    int max = 25;
    
    for(int i = 0, size = bingo.length; i < size; i++)
    {
      for(int j = 0, size2 = bingo[0].length ; j < size2; j++)
      {
        bingo[i][j] = (i * size) + (j + 1);
        iList.add(bingo[i][j]);
      }
    }
    
    for(int i = 0, size = bingo.length; i < size; i++)
    {      
      for(int j = 0, size2 = bingo[0].length ; j < size2; j++)
      {
        int rand = (int)(Math.random() * max);
        bingo[i][j] =  iList.get(rand);
        iList.remove(rand);
        max--;
      }
    }
    
    
    for(int i = 0, size = bingo.length; i < size; i++)
    {
      for(int j = 0, size2 = bingo[0].length ; j < size2; j++)
      {
        System.out.print(bingo[i][j] + "  ");
      }
      System.out.println();
    }
  }
  
  public static void method10()
  {
//    Scanner sc = new Scanner(System.in);
//    
//    /* 여기에 구현 */
//    int money = sc.nextInt();
//    money = money - (money % 1000);
    List<String> papers = new ArrayList<String>();
    List<Integer> in = new ArrayList<Integer>();
    
    for(int j = 0; j < 6; j++)
     {
       int lottoNum = (int)(Math.random() * 45) + 1;
       papers.add(String.valueOf(lottoNum));
       in.add(lottoNum);
       
     }
    
    Collections.sort(in);
    Collections.sort(papers);
    
    for(int i = 0; i < in.size(); i++)
      System.out.print(in.get(i) + " ");
    
    System.out.println();
    
    for(int i = 0; i < papers.size(); i++)
      System.out.print(papers.get(i) + " ");
    
    //System.out.println("머임");

  }

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Map<String, Object> map = method2("140101-3123456");
    
    //method1();
//    System.out.println("나이:" + map.get("나이"));
//    System.out.println("성별:" + map.get("성별"));
    
    //method4();
    //method5();
    //method6();
    //method7();
    //method8();
    //method9();
    method10();
  }

}
