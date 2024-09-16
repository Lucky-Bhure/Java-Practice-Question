package com.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr1 = {-20, -19, -12, -4, -1, 0 , 3, 5, 11, 19, 20};
        int target = 19;

        int index = 0;

        if (arr1[arr1.length-1] > arr1[0]) {
            index = binarySearchIncreasing(arr1, target);
        }
        System.out.println(index);

        int[] arr2 = {20, 19, 12, 4, 1, 0 , -3, -5, -11, -19, -20};
        if (arr2[arr2.length-1] < arr2[0] ) {
            index = binarySearchDecreasing(arr2, target);
        }

        System.out.println(index);
    }

    static int binarySearchIncreasing( int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if ( arr[mid] > target) {
                end = mid - 1;
            } else  {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchDecreasing( int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] < target) {
                end = mid - 1;
            } else if ( arr[mid] > target) {
                start = mid + 1;
            } else  {
                return mid;
            }
        }
        return -1;
    }
}
