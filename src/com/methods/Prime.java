package com.methods;

public class Prime {
    public static void main(String []args) {
        int num = 12;
        if(isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    static boolean isPrime(int num) {
        return num % 2 != 0;
    }
}
