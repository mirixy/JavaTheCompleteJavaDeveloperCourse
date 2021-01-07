package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(61, 9));
        System.out.println(getDurationString(3600));
    }

    private static String getDurationString (int minutes, int seconds) {
        if ( minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }


//       int calcSecondsToMinutes = seconds / 60;
//       int secondsR = seconds % 60;
//       int calcMinutes = calcSecondsToMinutes + minutes;

        else if (seconds < 10 && minutes > 0  ) {
            int hours = minutes / 60;
            int minutesRemain = minutes % 60;
            return hours + "h " + minutesRemain + "m 0" + seconds + "s";
        }
        else {
            int hours = minutes / 60;
            int minutesRemain = minutes % 60;
            return hours + "h " + minutesRemain + "m " + seconds + "s";
        }

    }
    private static String getDurationString (int seconds) {
        if ( seconds < 0) {

            return "Invalid value";
        }
        int minutes = seconds / 60;
        int secondsR = seconds % 60;
        return getDurationString(minutes, secondsR);
    }
}
