public class Hello {
    public static void main(String[] args){
        /* Variable String called Name. Put in your name */
        String name = "Miriam";
        System.out.println("Hello, " + name);

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        /* float myFirstFloatNumber = 5.3f;
        double myFirstDoubleNumber = 5.4;
        String s = "A String is a string of Characters";
        char characterC = 'c';

        System.out.println(myFirstNumber + " \n" + myFirstFloatNumber + " \n" + myFirstDoubleNumber + " \n" + s + " \n" + characterC);
        */
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    }
}
