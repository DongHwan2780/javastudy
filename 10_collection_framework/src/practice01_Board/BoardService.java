package practice01_Board;

import java.util.List;

public class BoardService
{
  private List<BoardVo> voList;
  
  public BoardService()
  {
    // TODO Auto-generated constructor stub
  }
  
  
  
  public BoardService(BoardVo vo)
  {
    super();
    this.voList.add(vo);
  }



  public List<BoardVo> getVoList()
  {
    return voList;
  }
  public void setVoList(List<BoardVo> voList)
  {
    this.voList = voList;
  }

  
}
