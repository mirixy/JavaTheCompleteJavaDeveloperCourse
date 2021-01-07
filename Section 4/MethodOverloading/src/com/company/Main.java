package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Miriam", 500);
	    calculateScore(500);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Player scored" + score + " points");
        return score * 1000;
    }

}
