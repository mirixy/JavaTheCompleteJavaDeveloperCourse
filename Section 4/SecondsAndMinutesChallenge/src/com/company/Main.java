package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(365, 150);
    }

    public static int getDurationString (int minutes, int seconds) {
        if ( minutes < 0 && seconds < 0 && seconds > 59) {
            System.out.println("Invalid value");
            return -1;
        }


        int calcSecondsToMinutes = seconds / 60;
        int secondsRemain = seconds % 60;
        int calcMinutes = calcSecondsToMinutes + minutes;
        int hours = calcMinutes / 60;
        int minutesRemain = calcMinutes % 60;
        System.out.println(hours + "h " + minutesRemain + "m " + secondsRemain + "s");
        return 0;


    }
}
