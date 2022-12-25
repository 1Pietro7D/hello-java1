public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Java"); //hello Java
    /* System.out.println("I am learning Java.");
    System.out.print("working");
    System.out.print(" progress:");
    System.out.print(5 * 5); */

    // VARIABLES

    //  String - stores text, such as "Hello". String values are surrounded by double quotes

    final String name = "John";  // final as const
    System.out.println(name);

    //  int - stores integers (whole numbers), without decimals, such as 123 or -123

    // int year = 1994;
    // System.out.println(year);
    
    int x,y,z;
    x = y = z = 2;
    //   System.out.println( x + y * z); // result 6 (2 + 4) correct
    //   System.out.println("ris:" + x + y * z);  // result 24 ("2" + 4)
    System.out.print("result:");
    System.out.print( x + y * z);  


    //  float - stores floating point numbers, with decimals, such as 19.99 or -19.99

    float height = 1.80f;
    System.out.println(height);

    //  char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes

    //char myLetter = 'Dc'; will generate error
    char myLetter = 'H';
    System.out.println(myLetter);

    //  boolean - stores values with two states: true or false

    boolean myBool = false;
    myBool = true;
    System.out.println(myBool);
  }
}