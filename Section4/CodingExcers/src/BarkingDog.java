public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && hourOfDay < 0 || barking && hourOfDay > 23){
            return false;
        }
        else if(barking && hourOfDay < 8 || barking && hourOfDay > 22){
            return true;
        }
        else {
            return false;
        }

    }

}
