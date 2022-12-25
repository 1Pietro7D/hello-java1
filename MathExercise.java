public class MathExercise { //   https://www.w3schools.com/java/java_ref_math.asp   (36)
    public static void main(String[] args) {
        System.out.println("Merry Christmas");

        int x=1, y=2, z=3;
        System.out.println(Math.max(x,z));  // max two value : return z
        System.out.println(Math.min(x,y));  // """: return x

        /* 
        if (x > y){
            System.out.println("x > y");
        } else {
            System.out.println("x < y");
        }
        */
        String val = (x > y) ? "x > y" : "x < y";
        System.out.println(val);
    }
}

// All Math methods are static.