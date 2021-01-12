package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(32);
    }
    public static void printFactors (int number) {
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for(int i = number; i >= 1; i-- ) {
            if (number % i == 0) {
                System.out.println(number / i);
            }
        }

    }
}
