package com.array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 34, 56, 52, 45, 5};

        int max = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        System.out.println("Maximum: "+ max);
    }
}
