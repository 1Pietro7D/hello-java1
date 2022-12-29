public class Meth {
    static void myPrint(String stamp) {
        // code to be executed
        System.out.println(stamp);
    }
    static void myPrintNum(int stamp) {
        // code to be executed
        System.out.println(stamp);
    }


    // Java Method Overloading
    static int plusMethod(int x, int y, int z) {
        return x + y + z;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }

    public static void main(String[] args) {
    {
    // VARIABLES
        String response = "executed";
        int x = 8;
        double xD = 4.3d; //lol

    // VARIABLES WITH METHOD
        int myNum1 = plusMethod(x, 5, 1);
        double myNum2 = plusMethod(xD, 6.26);
    
    // PRINT
        myPrint(response);
        myPrint("int: " + myNum1);
        myPrint("double: " + myNum2);
    
    }
// scope block
    {
        int response = sum(3); // 3 + 2 + 1 + 0
        myPrintNum(response); // = 6
    }
    }
}

/* 
//  - myPrint() is the name of the method.
//  - static means that the method belongs to the Main class and not an object of the Main class. 
//  - void means that this method does not have a return value.
//  - Multiple methods can have the same name as long as the number and/or type of parameters are different.
*/