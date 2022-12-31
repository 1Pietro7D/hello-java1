public class ObjectClass {
  int x = 5;
  int y = 3;

  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  

  public static void main(String[] args) {
    ObjectClass myObj_x = new ObjectClass();
    ObjectClass myObj_y = new ObjectClass();
    Main myObj_z1 = new Main();
    System.out.println(myObj_x.x);
    System.out.println(myObj_y.y);
    System.out.println(Main.z); // public/static
    //  System.out.println(myObj_z1.z); // public/static will generate error
    System.out.println(myObj_z1.z1); // public
    System.out.println(Main.z2);  // static
    System.out.println(myObj_z1.z0); // public
    

    myStaticMethod(); // Call the static method
    Meth.myPrint("from Meth class"); // Call the static method from Meth

    ObjectClass myObj = new ObjectClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method

    Meth myMeth = new Meth();  // Create an object of MyClass
    myMeth.myPrint2("from Meth class"); // Call the public method from Meth
  }
}
