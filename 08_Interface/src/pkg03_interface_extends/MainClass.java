package pkg03_interface_extends;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).Call();
    System.out.println();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone) computer).Call();    
    System.out.println();
    
    Phone phone = new SmartPhone();
    phone.Call();
    ((SmartPhone) phone).powerOn();
    ((SmartPhone) phone).game();
    System.out.println();
        
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.powerOn();
    smartPhone.game();
    smartPhone.Call();
  }

}
