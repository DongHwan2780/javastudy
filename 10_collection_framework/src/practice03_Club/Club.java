package practice03_Club;

import java.util.HashSet;
import java.util.Set;

public class Club
{
  private Set<Person> s;
  
  public Club()
  {
    // TODO Auto-generated constructor stub
    s = new HashSet<Person>();
  }
  public Club(Set<Person> s)
  {
    super();
    this.s = s;
  }
  
  
  
  public Set<Person> getS()
  {
    return s;
  }
  public void setS(Set<Person> s)
  {
    this.s = s;
  }
  
  public void enterClub(Person person)
  {
    s.add(person);
  }
  public void leaveClub(Person person)
  {
    s.remove(person);
  }
  public void checkPerson()
  {
    for(Person p : s)
      System.out.println(p);
  }
}
