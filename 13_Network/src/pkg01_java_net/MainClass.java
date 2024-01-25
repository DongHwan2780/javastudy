package pkg01_java_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    try
    {
      InetAddress netadd = InetAddress.getByName("gdu.co.kr");
      System.out.println("IP주소 : " + netadd.getHostAddress());
      System.out.println("도메인 : " + netadd.getHostName());
      
      // 112.175.247.163
      
      InetAddress netadd2 = InetAddress.getByAddress(new byte[] {112, (byte)175, (byte)247, (byte)163 });
      System.out.println("IP주소 : " + netadd2.getHostAddress());
      System.out.println("도메인 : " + netadd2.getHostName());
      
    }catch(UnknownHostException e)
    {
      e.printStackTrace();
    }
  }

}
