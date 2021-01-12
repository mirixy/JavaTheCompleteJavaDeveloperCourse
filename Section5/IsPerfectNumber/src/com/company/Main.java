package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 1){
            return false;
        }
        int nr = 0;
        int sum = 0;
        for(int i = number; i > 1; i-- ) {
            if (number % i == 0) {
                nr = number / i;
                sum += nr;
            }
        }
        if(sum == number){
            return true;
        }
        else {
            return false;
        }

    }
}
