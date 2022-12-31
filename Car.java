//filename: Car.java
public class Car {
  protected int modelYear;
  protected String modelName;
  String plate = "ks009";
  static String licenze = "ok";

  protected Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang"); // parameter REQUIRED
    System.out.println(myCar.modelYear + " " + myCar.modelName);
    System.out.println(myCar.plate + " " + licenze);
  }
}
class EletricCar extends Car { // java EletricCar
  private String typology = "Eletric";
  
  protected EletricCar(int year, String name) {
    super(year, name);
  }
    public static void main(String[] args) {
    EletricCar E_Car = new EletricCar(2020, "E-turbo");
    System.out.println(E_Car.typology + E_Car.modelYear + " " + E_Car.modelName);
  }
 
}