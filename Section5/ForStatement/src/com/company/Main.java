package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f",calculateInterest(10000.0, i) ));
        }
        //region Challenge prime numbers
        int prime = 0;
        for(int i = 0; i < 100; i++ ){
            if(isPrime(i) && i != 0){
                if(prime !=3){
                    prime++;
                    System.out.println(i + " is a prime number! " + prime + " prime numbers found");
                }
                else {
                    break;
                }

            }
        }
        //endregion

    }
    /*
        Create a for statement using any range of numbers
        Determine if the number is a Prime number using isPrime method
        if it is a prime number, print it out AND increment a count of the
        number of prime numbers found
        if that count is 3 exit the for loop
        hint: Use the break; statement to exit
     */
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i =2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
