package com.searching;

//  Find position of an element in a sorted array of infinite numbers
/*
Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.
*/

public class BinarySearchFindTargetInInfiniteArray {

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) /2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int findTargetInInfiniteArray( int[] arr, int target) {

        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int temp = end;
            end = end + (end - start + 1) * 2;
            start = temp + 1;
        }

        return  binarySearch(arr, target, start, end);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 230, 250, 260, 270};
        int target = 230;
        int index = findTargetInInfiniteArray(arr,target);
        System.out.print(index);
    }
}
