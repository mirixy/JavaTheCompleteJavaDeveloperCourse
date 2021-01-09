package com.company;

public class Main {

    public static void main(String[] args) {
	    /* A statement is the complete Line as shown below */
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");


        // Statements don't need to be one line
        System.out.println("This is " +
                "another " +
                "still more.");

	    int anotherVariable = 50; myVariable--; System.out.println("This is another one"); // This style is not that readable

        /* Concept of Whitespace */
        // Spaces are good to clarify things
        // Indenting is also better for readability
        if(myVariable == 50) {
            System.out.println("Printed");
        }




    }
}
