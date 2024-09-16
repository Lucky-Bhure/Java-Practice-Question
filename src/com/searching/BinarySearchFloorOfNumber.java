package com.searching;

// Floor Number Problem: If target not found then return the closest smaller number

public class BinarySearchFloorOfNumber {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        int mid = 0;
        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return  mid;
            }
        }

        return end;
    }

    public static void main(String[] args) {

        int[]  arr = {-20, -19, -12, -4, -1, 0 , 3, 5, 11, 19, 20};
        int target = 13;

        int index = binarySearch(arr, target);

        System.out.print(arr[index]);

    }
}
