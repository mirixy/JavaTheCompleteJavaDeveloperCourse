package com.company;

import java.text.Format;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(11));
    }
    public static int sumDigits ( int number){
        if(number < 10) {
            return -1;
        }
       int m, sum = 0;
        m = number;
        // While m (number) is bigger than 0,
        // add the remainder of the number to sum
        // discard the last digit from number
        // repeat.
        while(m > 0) {
            sum += m % 10;
            m = m / 10;
        }


        return sum;

    }
}

/*
    At first I didn't understand that. So I googled it to save some time.
    As soon as I saw an overview of how to do it, it became clear to me.
    In fact I should have read the instructions more clearly. That is tottaly
    my fault.
 */
