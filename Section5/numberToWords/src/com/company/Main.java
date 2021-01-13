package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(100);
        System.out.println(reverse(-121));
        System.out.println(getDigitCount(-12));


    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else{
            int dc = getDigitCount(number);
            number = reverse(number);
            String s = "";
            String nr = Integer.toString(number);
            int diff =  dc - nr.length();

            while (number != 0) {
                int rem = number % 10;
                number /= 10;
                switch (rem) {
                    case 0:
                        s += "Zero ";
                        break;
                    case 1:
                        s += "One ";
                        break;
                    case 2:
                        s += "Two ";
                        break;
                    case 3:
                        s += "Three ";
                        break;
                    case 4:
                        s += "Four ";
                        break;
                    case 5:
                        s += "Five ";
                        break;
                    case 6:
                        s += "Six ";
                        break;
                    case 7:
                        s += "Seven ";
                        break;
                    case 8:
                        s += "Eight ";
                        break;
                    case 9:
                        s += "Nine ";
                        break;
                    default:
                        break;
                }

            }
            if (dc != nr.length()) {
                for(int i = 0; i < diff; i++){
                    s += "Zero ";
                }
            }

            System.out.println(s);
        }
    }

    public static int reverse(int number) {
        String n = "";
        boolean wasNeg = false;
        if(number<0){
            number = number * -1;
            wasNeg = true;
        }
        while (number != 0) {
            int rem = number % 10;
            number /= 10;
            switch (rem) {
                case 0:
                    n += "0";
                    break;
                case 1:
                    n += "1";
                    break;
                case 2:
                    n += "2";
                    break;
                case 3:
                    n += "3";
                    break;
                case 4:
                    n += "4";
                    break;
                case 5:
                    n += "5";
                    break;
                case 6:
                    n += "6";
                    break;
                case 7:
                    n += "7";
                    break;
                case 8:
                    n += "8";
                    break;
                case 9:
                    n += "9";
                    break;
                default:
                    break;
            }
        }
        if(wasNeg){
            int neg = Integer.parseInt(n) ;
            neg = neg - (neg *2 );
            return neg;
        }
        else{
            number = Integer.parseInt(n);
            return number;
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
