package practice03_Club;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Club club = new Club();
    
    club.enterClub(new Person("a"));
    club.enterClub(new Person("b"));
    club.enterClub(new Person("c"));
    club.enterClub(new Person("d"));
    club.enterClub(new Person("d"));
    club.enterClub(new Person("d"));
    club.enterClub(new Person("e"));
    
    club.leaveClub(new Person("a"));
    
    club.checkPerson();
  }

}
