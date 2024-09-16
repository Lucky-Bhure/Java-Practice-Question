package com.practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1134313;
        int rev = 0;

        while(num != 0) {
            int rem = num % 10;
            num = (num - rem)/10;

            rev = rev * 10 + rem;
        }

        System.out.println("Reverse Number: "+rev);
    }
}
