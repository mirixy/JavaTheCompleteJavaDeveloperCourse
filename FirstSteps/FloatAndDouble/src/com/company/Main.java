package com.company;

public class Main {

    public static void main(String[] args) {
	    float myFloat = 1.5f;
	    float myFloatMaximum = Float.MAX_VALUE;
	    float myFloatMinimum = Float.MIN_VALUE;
        System.out.println("Minimum Float " + myFloatMinimum);
        System.out.println("Maximum Float " + myFloatMaximum);

        double myDouble = 1.5;
        double myDoubleMaximum = Double.MAX_VALUE;
        double myDoubleMinimum = Double.MIN_VALUE;
        System.out.println("Minimum Double " + myDoubleMinimum);
        System.out.println("Maximum Double " + myDoubleMaximum);

        int myIntValue = 5 / 3 ;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // Challenge Convert a given number of pounds to kilograms
        double kilograms = 0.45359237d;
        double poundsToKg = kilograms * 6d;
        System.out.println(poundsToKg);

    }
}
