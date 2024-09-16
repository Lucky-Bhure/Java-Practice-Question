package com.array;

public class ReverseArray {
    public static void main(String[] args) {

        String[] arr = {"String1","String2","String3","String4","String5","String6","String7"};

        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(String i: arr) {
            System.out.print(i+" ");
        }
    }
}
