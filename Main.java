public class Main {
    public static final int z = 3;
    public final int z1 = 4;
    static int z2 = 1;
    public int z0 = 0;


    public static void main(String[] args) {
        System.out.println("Hello Java"); //hello Java
        System.out.println(z);
        // VARIABLES

        /////  STRING 
        //  https://www.w3schools.com/java/java_ref_string.asp  (38)
        //  String - stores text, such as "Hello". String values are surrounded by double quotes

        final String name = "John";  // final as const
        String res = "Result: ";
        String con = "Convert:";
        System.out.println(res.concat(name));

        /////  INT
        //  int - stores integers (whole numbers), without decimals, such as 123 or -123

        // int year = 1994;
        // System.out.println(year);
        Integer number = 100;
        System.out.println(number);
        // int x,y,z;
        byte x,y,z;
        x = y = z = 2;
        System.out.println(z);
        System.out.println(Main.z);
        System.out.println( x + y * z); // result 6 (2 + 4) correct
        //  System.out.println("ris:" + x + y * z);  // result 24 ("2" + 4)
        System.out.print("result:");
        System.out.print( x + y * z); // RESULT 6 correct
        System.out.println();
        
        // increment

        ++x;    // now x = 3
        x += 5; // now x = 8
        --x; // now x = 7
        System.out.println( x );

        /////  FLOAT and DOUBLE 
        //  float - stores floating point numbers, with decimals, such as 19.99 or -19.99

        float f1 = 35e3f; //   with "e" or "E" you can use 10*n   //  int f2 = 35e3; -> error
        double d1 = 12d / -1E4d; //12 / 10000       --- decimal is more accurate ---
        System.out.println(f1); //result: 35000.0
        System.out.println(d1); //result: -0.0012  

        // CASTING
        System.out.println(con);
        double myDouble = 9.78d;
        System.out.println(myDouble);
        // Narrowing Casting is manualy 
        int myInt = (int)myDouble; 
        myDouble = (int)myDouble; // not total convert 
        System.out.println(myDouble);
        System.out.println(myInt);
        // Widening Casting is automatically
        int myInt2 = 9;
        double myDouble2 = myInt2; // total convert - you can whrite without (double) because: double -> 8byte vs int -> 4byte
        System.out.println(myDouble2);

        /*
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */

        ///// CHAR
        //  char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes

        //char myLetter = 'Dc'; will generate error
        char myLetter = 'H';
        System.out.println(myLetter);
        // FOR ASCI: https://www.w3schools.com/charsets/ref_html_ascii.asp
        
        ///// BOOLEAN
        //  boolean - stores values with two states: true or false

        boolean myBool = false;
        myBool = true;
        System.out.println(myBool);

        Boolean myWrapperClass = true;
        System.out.println(myBool == myWrapperClass);
        


    }

    // public int z; 
}   

/* 
// PRIMITIVE DATA TYPES
//
// A primitive data type specifies the size and type of variable values, and it has no additional methods.
// There are eight primitive data types in Java:
//
// byte	    ->  1 byte	Stores whole numbers from -128 to 127
// short	->  2 bytes	Stores whole numbers from -32'768 to 32'767
// int	    ->  4 bytes	Stores whole numbers from -2'147'483'648 to 2'147'483'647
// long	    ->  8 bytes	Stores whole numbers from -9'223'372'036'854'775'808 to 9'223'372'036'854'775'807-- WANT L final
// float	->  4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits -- WANT f final
// double	->  8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits -- WANT d final
// boolean	->  1 bit	Stores true or false values
// char	    ->  2 bytes	Stores a single character/letter or ASCII values WANT ''
*/

/* 
// NON-PRIMITIVE DATA TYPES
//
// Non-primitive data types are called reference types because they refer to objects.
// The main difference between primitive and non-primitive data types are:
//
// · Primitive types are predefined (already defined) in Java. Non-primitive types are created by 
//   the programmer and is not defined by Java (except for String).
//
// · Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
//
// · A primitive type has always a value, while non-primitive types can be null.
//
// · A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
//
// · The size of a primitive type depends on the data type, while non-primitive types have all the same size.
//
// · Examples of non-primitive types are: Strings, Arrays, Classes, Interface, etc.
//   
*/