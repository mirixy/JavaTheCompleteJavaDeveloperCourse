package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(15, 25));
    }

    public static boolean hasSharedDigit(int number, int number2) {
        if (number < 10 || number > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        else {
            int numOne = number;
            int numTwo = number2;
            int digitOne = numOne % 10;
            int digitTwo = numTwo % 10;
            numOne /= 10;
            numTwo /= 10;
            int digitThree = numOne;
            int digitFour = numTwo;
            if (digitOne == digitTwo || digitOne == digitFour || digitTwo == digitThree || digitFour == digitThree) {
                return true;
            }
            else {
                return false;
            }
        }


    }
}
