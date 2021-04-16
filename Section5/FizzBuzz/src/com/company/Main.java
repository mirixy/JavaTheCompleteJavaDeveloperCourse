package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write a short program that prints each number from 1 to 100 on a new line.
        // For each multiple of 3, print "Fizz" instead of the number
        // For each multiple of 5, print "Buzz" instead of the number
        // For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
        fizzBuzz(100);
        fizzBuzz(1000);
    }
    private static void fizzBuzz(int n){
        int i = 1;
        while ( i <= n){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                i++;
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
                i++;
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
                i++;
            }

            else {
                System.out.println(i);
                i++;
            }
        }
    }
}

