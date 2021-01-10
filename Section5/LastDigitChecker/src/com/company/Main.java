package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasSameLastDigit(41, 22, 71);
        isValid(10);
    }
    public static boolean hasSameLastDigit(int number, int number2, int number3) {
        if (number < 10 || number > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
            return false;
        } else {
            int digitOne = number % 10;
            int digitTwo = number2 % 10;
            int digitThree = number3 % 10;
            if (digitOne == digitTwo || digitOne == digitThree || digitThree == digitTwo) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static boolean isValid (int num) {
        if (num < 10 || num > 1000 ) {
            return false;
        }
        return true;
    }
}

