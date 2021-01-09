package com.company;

public class Main {

    public static void main(String[] args) {


        //region While not 6
        int count = 1;
	    while (count!= 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        //endregion


        //region While statement is true if 6 break
        count =1;
	    while(true) {
	        if(count == 6){
	            break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }
        //endregion



        //region Do While
        count =1;
	    do {
            System.out.println("Count value was " + count);
            count++;
        }   while (count != 6);
        //endregion



//	    for (count = 1; count !=6; count++){
//            System.out.println("Count value is " + count);
//        }


        //region Challenge
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;
        // hint remainder operator
        int number = 4;
        int finishNumber = 20;
        int counter = 0;
        int sum = 0;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            counter++;
            System.out.println("Even number " + number);
            sum = sum + number;
            if(counter == 5){
                break;
            }



        }
        System.out.println("Found " + counter + " even numbers! It has a total sum of " + sum);
        //endregion
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found.

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
