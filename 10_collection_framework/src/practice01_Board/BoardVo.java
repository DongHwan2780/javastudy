package practice01_Board;

public class BoardVo
{
  private int boardNum;
  private String title, writer, createdAt;
  
  public BoardVo()
  {
    // TODO Auto-generated constructor stub
  }
  public BoardVo(int boardNum, String title, String writer, String createdAt)
  {
    super();
    this.boardNum = boardNum;
    this.title = title;
    this.writer = writer;
    this.createdAt = createdAt;
  }
  public int getBoardNum()
  {
    return boardNum;
  }
  public void setBoardNum(int boardNum)
  {
    this.boardNum = boardNum;
  }
  
  public String getTitle()
  {
    return title;
  }
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public String getWriter()
  {
    return writer;
  }
  public void setWriter(String writer)
  {
    this.writer = writer;
  }
  
  public String getCreatedAt()
  {
    return createdAt;
  }
  public void setCreatedAt(String createdAt)
  {
    this.createdAt = createdAt;
  }
  
  
}
