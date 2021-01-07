package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(61, 0);
        getDurationString(3600);
    }

    public static int getDurationString (int minutes, int seconds) {
        if ( minutes < 0 && seconds < 0 && seconds > 59) {
            System.out.println("Invalid value");
            return -1;
        }


        int calcSecondsToMinutes = seconds / 60;
        int secondsR = seconds % 60;
        int calcMinutes = calcSecondsToMinutes + minutes;
        int hours = calcMinutes / 60;
        int minutesRemain = calcMinutes % 60;
        if (secondsR == 0 && minutesRemain > 0 && hours > 0 ){
            System.out.println(hours + "h " + minutesRemain + "m " + "00s");
        }
        else
        System.out.println(hours + "h " + minutesRemain + "m " + secondsR + "s");
        return 0;

    }
    public static int getDurationString (int seconds) {
        if ( seconds < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        int minutes = seconds / 60;
        int secondsR = seconds % 60;
        return getDurationString(minutes, secondsR);
    }
}
