package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }
    public static int sumFirstAndLastDigit(int number) {
        // Check if Number is Negative
        if(number < 0) {
            return -1;
        }
        // Initialize Variables
        int num = number;
        int sum = 0;
        int lastDigit = num % 10; // get last Digit
        sum += lastDigit; // add last Digit to sum
        num /= 10; // discard the last Digit
        // While num is bigger than ZERO
        while (num > 0) {
            lastDigit = num % 10; //  get last remaining digit
            num /= 10; // discard last digit
        }
        // add the last digit before num was zero to the sum
        sum += lastDigit;
        return sum;


    }
}
