package practice01_byte_copy;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    MyFileUtils mfu = new MyFileUtils();
    //mfu.fileCopy("\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
    mfu.fileMove("\\storage\\LICENSE", "\\storage\\move\\LICENSE");
  }

}
