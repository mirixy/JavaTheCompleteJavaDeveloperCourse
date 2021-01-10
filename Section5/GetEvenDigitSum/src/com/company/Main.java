package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // should return 20
    }
    public static int getEvenDigitSum(int number) {
        // Check if number is below ZERO
        if (number < 0) {
            return -1;
        }
        // Initialize Variables
        int num = number;
        int digit = 0;
        int even = 0;
        int sum = 0;
        // While number is greater than ZERO
        while(num>0){
            // get last digit
            digit = num % 10;
            // if last digit is even
            if(digit % 2 == 0){
                // add last digit to sum
                sum +=digit;
                // discard last digit from number
                num /= 10;
            }
            else{
                // discard last digit from number
                num /=10;
            }

        }
        return sum;
    }
}
