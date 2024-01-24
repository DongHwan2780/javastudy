package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) 
  {
    
    File file = new File(src.toString());
    File file2 = new File(dest.toString());
    
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try
    {
      br = new BufferedReader(new FileReader(file));
      bw = new BufferedWriter(new FileWriter(file2)); 
      
      String line = null;
      StringBuilder sb = new StringBuilder();
      
      while((line = br.readLine()) != null)
        sb.append(line).append("\n");
      
      br.close();
      bw.write(sb.toString());
      bw.close();
      
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    
  }

  public static void fileMove(File src, File dest) 
  {
    fileCopy(src, dest);
  }
  
}