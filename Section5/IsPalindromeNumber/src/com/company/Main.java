package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        // Initialize the variables
        int num = number;
        int reverse = 0;
        int lastDigit = 0;
        // While num is bigger than ZERO
        while (num > 0) {
            // get the last digit of num
            lastDigit = num % 10;
            // multiply reverse by 10
            reverse = reverse * 10;
            // add last digit to reverse
            reverse = reverse + lastDigit;
            // discard the last digit of number
            num /= 10;
        }
        // While num is smaller than ZERO
        while (num < 0) {
            // get the last digit of num
            lastDigit = num % 10;
            // multiply reverse by 10
            reverse = reverse * 10;
            // add last digit to reverse
            reverse = reverse + lastDigit;
            // discard the last digit of number
            num /= 10;
        }
        // If number is same as reverse number
        if(number == reverse) {
            // number is palindrome
            return true;
        }
        else {
            // number is not palindrome
            return false;
        }
    }
}
