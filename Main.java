public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Java"); //hello Java

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

/* 
// PRIMITIVE DATA TYPES
//
// A primitive data type specifies the size and type of variable values, and it has no additional methods.
// There are eight primitive data types in Java:
//
// byte	    ->  1 byte	Stores whole numbers from -128 to 127
// short	->  2 bytes	Stores whole numbers from -32,768 to 32,767
// int	    ->  4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	    ->  8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	->  4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	->  8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean	->  1 bit	Stores true or false values
// char	    ->  2 bytes	Stores a single character/letter or ASCII values
*/