package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFileUtils
{
  public static void fileCopy(String src, String dest)
  {
    File file = new File(src);
    BufferedInputStream bis = null;
    FileOutputStream fos = null;
    File file2 = new File(dest);
    try
    {
      bis = new BufferedInputStream(new FileInputStream(file));
      
      byte[] b = new byte[(int)file.length()];
      byte[] bytes = new byte[5];
      int idx = 0;
      
      int readByte = 0;
      while((readByte = bis.read(bytes)) != -1)
      {
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length;
      }
      bis.close();
      
      
      fos = new FileOutputStream(file2);
      fos.write(b);
      fos.close();
      
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static void fileMove(String src, String dest)
  {
    File file = new File(src);
    File file2 = new File(dest);
    
    BufferedInputStream  bis = null;
    BufferedOutputStream bos = null;
    
    try
    {
      bis = new BufferedInputStream(new FileInputStream(file));
      bos = new BufferedOutputStream(new FileOutputStream(file2));
      
      byte[] b = new byte[(int)file.length()];
      byte[] bytes = new byte[5];
      int readByte = 0;
      int idx = 0;
      
      while((readByte = bis.read(bytes)) != -1)
      {
        bos.write(bytes, 0, readByte);
      }
      
      bos.close();
      bis.close();
      
      if(file.exists())
        file.delete();
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}
