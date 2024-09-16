package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);

        for(int i = 0; i < 10; i++) {
            arr.add(in.nextInt());
        }



        for(int i = 0; i < 10; i++) {
            System.out.print(arr.get(i)+ " ");
        }

        System.out.println(arr.contains(5));

        arr.remove(7);

        for(int i = 0; i < 9; i++) {
            System.out.print(arr.get(i)+ " ");
        }
    }
}
