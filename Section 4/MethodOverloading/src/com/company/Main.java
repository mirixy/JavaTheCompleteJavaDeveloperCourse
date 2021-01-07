package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Miriam", 500);
	    calculateScore(75);
	    calculateScore();

	    // Challenge
        calcFeetAndInchesToCentimeters(6,12);
        calcFeetAndInchesToCentimeters(50);
        // ende
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No Player name, no player score");
        return 0;
    }


    //region Challenge Code
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet >= 0 && inches >=0 && inches <= 12){
            double centimeterInches = inches * 2.54d + (feet / 0.032808);
            System.out.println("centimeters " + centimeterInches);
            calcFeetAndInchesToCentimeters(inches);
            return centimeterInches;
        } else return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches >= 0 ){
            double foot = inches / 12;
            System.out.println("inches " + foot);
            return foot;
        } else return -1;

    }
    //endregion

}

/*
    Create a method called calcFeetAndInchesToCentimers
    It needs to have two parameters.
    feet is the first parameter, inches is the 2nd parameter

    You should validate that the first parameter feet is >= 0
    You should validate that the 2nd parameter inches is >= 0 and <=12
    return -1 from the method if either of the above is not true

    If the parameters are valid, then calculate how many centimetres comprise the feet
    and inches passed to this method and return that value.

    Create a 2nd method of the same name but with only one parameter inches is the
    parameter
    validate that its >=0
    return -1 if it is not true
    But if its valid, then calculate how many feet are in the inches and here is
    the tricky part
    call the overloaded method passing the correct feet and inches
    calculated so that it can calculate correctly.

    hints: Use double for your number datatypes is probably a good idea
    1 inch = 2.54cm and one foot = 12 inches
    use the link I give you to confirm your code is calculating correctly.
    Calling another overloaded method just requires you to use the right number
    of parameters.
 */
