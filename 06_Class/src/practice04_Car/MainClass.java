package practice04_Car;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Driver driver = new Driver("elsa", 5);
    System.out.println(driver.isBestDriver());
    
    Driver driver2 = new Driver();
    driver2.setName("elsa");
    driver2.setCareer(20);
    System.out.println(driver2.isBestDriver());
    
    Car car = new Car(driver2, 0, 100);
    car.enginestart();
    car.accelerator(5);
    car.brake(5);
  }

}
