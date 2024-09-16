package com.methods;

public class Armstrong {

    public static void main(String []args) {

        int num = 153;

        if(isArmstrong(num)) {
            System.out.println(num + " is a Armstrong Number");
        } else {
            System.out.println(num + " is not a Armstrong Number");
        }
    }

    static boolean isArmstrong(int num ) {
        int result = 0;
        int temp = num;

        while(num != 0 ) {
            int rem = num % 10;
            num = (num - rem)/10;

            result = result + (rem * rem * rem);

        }
        return (temp == result);
    }
}
