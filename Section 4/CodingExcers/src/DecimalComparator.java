
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        String str = String.valueOf(numberOne);
        String str2 = String.valueOf(numberTwo);
        String result1 = str.substring(0,5);
        String result2 = str2.substring(0,5);
        if(result1.equals(result2)){
            System.out.println(result1 + " " + result2 );
            return true;
        }
        else {  return false; }



    }
    /* public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
            double difference = Math.abs((double) (numberOne - numberTwo));

            return (difference < 0.0009);
    }*/

}
/*
    I need to learn this. How could I fail so hard ? I thought about using Arrays but couldn't figure out
    how to implement this. This solution is way simpler than what I came up with. And mine didn't even worked.
    How unfortunate. I hope I can find a nother way of doing this to prove me right.
    With C++ I did this with now problem at all, back when I did this.
 */