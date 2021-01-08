package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isCatPlaying(false, 25);
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (!summer && temperature < 25 || !summer && temperature > 35 || summer && temperature > 45 || summer && temperature < 25) {
            System.out.println("False");
            return false;
        }
        else if (!summer && temperature >= 25 && temperature <= 35) {
            System.out.println("Not Summer but True");
            return true;
        }
        else if (summer && temperature >= 25 && temperature <= 45){
            System.out.println("Summer and True");
            return true;
        }
        else {
            System.out.println("second False");
            return false;
        }
    }
}
