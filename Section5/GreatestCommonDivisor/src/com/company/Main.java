package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestommonDivisor(9,15));
    }
    public static int getGreatestommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int divisorOne = 0;
        int divisorTwo = 0;
        int firstOld = 0;
        int secondOld = 0;
        int firstDiv = 1;


        for(int i = 1; i < 100; i++){
            if (first % i == 0 && second % i == 0){
                 divisorOne = i;
            }
            else if(first / i == 0 || second / i == 0){
                break;
            }
        }
        return divisorOne;



    }
}
