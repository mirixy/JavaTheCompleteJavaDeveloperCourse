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
