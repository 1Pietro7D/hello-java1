public class Meth {
    static void myPrint(String stamp) {
        // code to be executed
        System.out.println(stamp);
      }
    
    public static void main(String[] args) {
        String response = "executed";
        myPrint(response);
    }
}

/* 
myMethod() is the name of the method
static means that the method belongs to the Main class and not an object of the Main class. 
void means that this method does not have a return value.
*/