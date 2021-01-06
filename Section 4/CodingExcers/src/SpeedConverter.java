public class SpeedConverter {
    /*public static void main(String[] args) {
        printConversion(1.5);
        printConversion(-5.6);
    }*/
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }


    }

}
