package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);
        double numberString = Double.parseDouble(numberAsString);
        System.out.println("String parsed as an Integer in numberString= " + numberString);
        /*
            Parsing is useful
         */
        numberAsString += 1;
        numberString += 1;
        System.out.println("Value of numberAsString= " + numberAsString);
        System.out.println("Value of numberString= " + numberString);


        System.out.println(canPack(2,1,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = 0;
        int big = bigCount * 5;
        int goalDiff = big - goal;
        sum = smallCount + big;
        int smallDiff = smallCount - goal;

        if(sum >= goal && bigCount >=0 && smallCount >= 0 && goal >= 0){
            if(big > goal && smallCount < goal){
                return false;
            }
            if(goalDiff < big || sum == goal) {
                System.out.println("first");
                return true;
            }
            else if(smallCount > smallDiff && smallDiff > 0){
                System.out.println("second");
                return true;
            }

        }
        else {
            System.out.println("nande");
        }
            return false;

    }

}
