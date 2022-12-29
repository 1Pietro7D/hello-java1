public class ObjectClass {
    int x = 5;
    int y = 3;

    public static void main(String[] args) {
      ObjectClass myObj_x = new ObjectClass();
      ObjectClass myObj_y = new ObjectClass();
      Main myObj_z1 = new Main();
      System.out.println(myObj_x.x);
      System.out.println(myObj_y.y);
      System.out.println(Main.z);
      System.out.println(myObj_z1.z1);
      System.out.println(Main.z2);
      System.out.println(myObj_z1.z0);
    }
}
