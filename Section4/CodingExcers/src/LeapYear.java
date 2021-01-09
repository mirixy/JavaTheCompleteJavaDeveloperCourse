public class LeapYear {

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        /* This was confusing because I didn't know how to calculate a leap year. I should have looked up the calculation  */
        else if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
                System.out.println("true");
                return true;
        }
        else {
                System.out.println("false");
                return false;
        }
    }
}


