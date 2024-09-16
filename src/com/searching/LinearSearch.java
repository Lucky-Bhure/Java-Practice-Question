package com.searching;

import javax.sound.midi.SysexMessage;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 34, 43, 23, 45, 76, 23 };

        int num = 34;
        boolean status = false;

        if(arr.length == 0) {
            System.out.println("Element not found");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                System.out.println("Element found at index: " + i);
                status = true;
            }
        }

        if(!status) {
            System.out.println("Element not found");
        }

//        Linear Search Time Complexity :  best case = O(1),  worst case= O(n)
    }
}
