package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // This is an Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue -1)); // This is an Underflow

        int myMaxIntTest = 2_147_483_647; // This is also possible

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
       /* Java treats this as an Integer unless Followed by an L!
        long bigLongLiteralValue = 2_147_483_647_234; // Not possible */
        long bigLongLiteralValue = 2_147_483_647_234L; // Now Java knows its a long Value
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        /* Casting means to treat or convert a number from one type to another. We put the
        type we want the number to be in parenthesis like this: (type) */
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2 );


        //Challenge
        byte myNewVariable = 10;
        short myNewShort = 20;
        int anyIntValue = 50;
        long myLongStory = 50000L + (myNewVariable + myNewShort + anyIntValue) * 10;
        /* Solution */
        long solutionLong = 50000L + 10L * (myNewVariable + myNewShort + anyIntValue);
        System.out.println("Challenge sum = " + myLongStory+ " Solution = " + solutionLong);


    }
}
