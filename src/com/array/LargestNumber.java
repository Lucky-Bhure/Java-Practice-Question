package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<Integer> arr = new ArrayList<>();

        boolean i = true;
        int max = 0;
        while(i) {
            int val = sc.nextInt();
            if(max < val) {
                max = val;
            }
            arr.add(val);
            if(val == 0) {
                i = false;
            }
        }
        System.out.println(max);
        System.out.println(arr);

    }
}
