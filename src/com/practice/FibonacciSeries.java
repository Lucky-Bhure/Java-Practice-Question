package com.practice;

public class FibonacciSeries {

//    static int fib(int n) {
//        int first = 0, second = 1;
//        if(n == 0) {
//            return first;
//        } else if(n == 1) {
//            return second;
//        }
//        for(int i = 2; i <= n; i++) {
//            int temp = first + second;
//            first = second;
//            second = temp;
//        }
//        return second;
//    }

    public static void main(String []args) {

        int n = 10;
        int first = 0;
        int second = 1;
        System.out.print(first + " " +second);

        for (int i = 2; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
            System.out.print(" " + temp);
        }

//        System.out.println(fib(2));

    }

}

