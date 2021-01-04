package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 3 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) =1 % is called the Modular
        System.out.println("4%3 = " + result);

        // result = result + 1
        result++; // 1 + 1;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 =  "+ result);

        // result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10  = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 10 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!, mate");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true!");
        }

        // Challenge, well Not a Challenge for me. q.q Boring stuff in the beginning that I did in other programming
        //  languages too...
        int newValue = 50;
        if (newValue == 50){ // The Equal signs have to be == otherwise it will treat it as an Integer, which can't be in an if statement, I think.
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true){ // There was only one = sign, so it sets the boolean to true and not comparing it.
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        /* The ternary operator "?" is a shortcut to assigning one of two values to a variable depending on
            a given condition.

            It's a shortcut of the if-then-else statement
         */

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        /* Operand one - ageOfClient == 20 in this case is the condition we are checking. It needs to return true or false.
            Operand two - true here is the value to assign to the variable isEighteenOrOver if the condition is true
            Operand three - false here is the value to assign to the variable isEighteenOver if the condition was false.
         */


        // Operator Challenge
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myresult = (myDouble + mySecondDouble) * 100.00d;
        double myRemainder = myresult % 40.00d;
        boolean isResultTrue = (myRemainder == 0) ? true:false;
        System.out.println("Is the remainder 0 ? " + isResultTrue);
        if (!isResultTrue){
            System.out.println("Got some remainder " + myRemainder);
        }



    }
}
