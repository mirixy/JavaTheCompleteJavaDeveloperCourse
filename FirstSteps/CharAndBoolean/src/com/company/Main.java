package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // only one character can be stored! Unicode as well!
        String myString = "This is a String. It contains more than one character ";

        char myUnicode = '\u0044';
        System.out.println(myUnicode + " " + myChar);
        char myCopyrightChar = '\u00A9' ;
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println("Is the Customer over Twentyone " + isCustomerOverTwentyOne);
    }
}
