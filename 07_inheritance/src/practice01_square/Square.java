package practice01_square;

public class Square extends Rectangle
{
  private int width, height;
  
  public Square()
  {
    // TODO Auto-generated constructor stub
  }
  public Square(int length)
  {
    super(length, length);
    this.width = length;
    this.height = length;
  }
  
  public int getWidth()
  {
    return width;
  }
  public void setWidth(int width)
  {
    this.width = width;
  }
  
  public int getHeight()
  {
    return height;
  }
  public void setHeight(int height)
  {
    this.height = height;
  }
  
  
}
