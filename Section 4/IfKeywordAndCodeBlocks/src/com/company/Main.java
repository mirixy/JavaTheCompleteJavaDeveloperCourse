package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 4000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(score == 5000)
            System.out.println("Your score was 5000"); // without a code block there is only one line possible

		System.out.println("This was executed"); // only this one would be executed

		if(score < 5000 && score > 1000){
			System.out.println("Your score was less than 5000 but greater than 1000 ");
			System.out.println("Play again ?"); // now both lines are executed
		} else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		}
		else {
			System.out.println("Got here");
		}

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		/* This variable can't access the variable in the code block outside the code block. But the other way
		around would work.
		int savedFinalScore = finalScore;
		 */

		// Challenge
		/*
			Print out a second score on the screen with the following
			score set to 10000
			levelCompleted set to 8
			bonus set to 200
			But make sure the first printout above still displays as well
		 */
		/* The tutorial Solution
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}*/

		// Using a Method - my Solution
		myMethod(4000, 5, 100);
		myMethod(10000, 8, 200);



    }

	public static void myMethod(int score, int levelCompleted, int bonus){
		boolean gameOver = true;
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
	}

}
