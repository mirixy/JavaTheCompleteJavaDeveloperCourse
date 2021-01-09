package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" Your final score was " + highScore);


        // Methods Challenge
        /*
            Create a method called displayHighScorePosition
            it should a players name as a parameter, and a 2nd parameter as a position in the high score table
            You should display the players name along with a message like " managed to get into position " and the
            position they got and a further message " on the high score table."

            Create a 2nd method called calculateHighScorePosition
            it should be sent one argument only, the player score
            it should return an int
            the return data should be
            1 if the score is > 1000
            2 if the score is >500 and < 1000
            3 if the score is >100 and < 500
            4 in all other cases
            call both methods and display the result of the following
            a score of 1500, 900, 400, and 50
         */

        displayHighScorePosition("Miriam", 1500);
        displayHighScorePosition("Andi", 900);
        displayHighScorePosition("Mike", 400);
        displayHighScorePosition("William", 50);

    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int positionHighScoreTable) {
        System.out.println(playersName + " managed to get into position "
                + calculateHighScorePosition(positionHighScoreTable) + " on the high score Position.");

    }

    public static  int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        }
//        else if(playerScore >=500){
//           return 2;
//        }
//        else if(playerScore >=100){
//            return 3;
//        }else {
//            return 4;
//        }

        /* sometimes multiple returns are confusig */
        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000){
            position =1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;


    }


}
