package com.array;

public class MinNumber {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 34, 56, 52, 45, 5};

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Minimun: "+ min);

    }
}
