public class Week {
    public static void main(String[] args) {
        int num = 0;
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sunday :P");
        }

        String[] week = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (String day : week) {
          System.out.println(day);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;   // continue jump value 4
            }
            System.out.println(i);
          }
    }

}
