package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
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
            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }
            String minutesString = minutesRemain + "m ";
            if (minutesRemain < 10) {
                minutesString = "0" + minutesString;
            }

            return hoursString  + minutesString  + secondsString ;


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
