package com.company;

import java.text.Format;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        /*
            Switch is good to use if you want to test the same variable testing different values
         */

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        /*
            Challenge:
            Create a new switch statement using char instead of int
            create a new char variable
            create a switch statement testing for
            A, B, C, D, or E
            display a message if any of these are found and then break
            Add a default which displays a message saying not found
         */

        char myChar = 'F';

        switch (myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found char " + myChar);
                break;

            default:
                System.out.println("Char Case not found");
                break;
        }


        String month = "JanuaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "february":
                System.out.println("Feb");
                break;

            default:
                System.out.println("Was not January or February");
                break;
        }

    }
}
