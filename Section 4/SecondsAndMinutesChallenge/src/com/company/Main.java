package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(160, 9));
        System.out.println(getDurationString(3600));
    }

    private static String getDurationString (int minutes, int seconds) {
        if ( minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }


//       int calcSecondsToMinutes = seconds / 60;
//       int secondsR = seconds % 60;
//       int calcMinutes = calcSecondsToMinutes + minutes;

            int hours = minutes / 60;
            int minutesRemain = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String secondssString = seconds + "s";
            if (seconds < 10){
                secondssString = "0" + secondssString;
            }
            String minutessString = minutesRemain + "m ";
            if (minutes < 10) {
                minutessString = "0" + minutessString;
            }

            return hoursString  + minutessString  + secondssString ;


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
