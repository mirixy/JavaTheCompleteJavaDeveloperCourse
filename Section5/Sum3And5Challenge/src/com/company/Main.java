package com.company;

public class Main {

    public static void main(String[] args) {
	    // Create a statement using a range of numbers from 1 to 1000 incl.
        // Sum all the numbers that can be divided with both 3 and also with 5
        // For those numbers that met the above conditions, print out the number.
        // break out of the loop once you find 5 numbers that met the above conditions
        // After breaking out of the loop print the sum of the numbers that met the above conditions
        // Note: Type all code in main method
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++ ){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                System.out.println("The number is " +i );
                sum += i;
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println("The sum of numbers found = " + sum);

    }
}
