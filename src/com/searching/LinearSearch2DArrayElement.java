package com.searching;

public class LinearSearch2DArrayElement {
    public static void main(String[] args) {

     int[][] arr = {
             {2,3,4,5,3},
             {5,7,34,54,66,52},
             {23,1,22,44,33,77},
     };

     boolean status = false;
     int num = 9;

     for(int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
             if( arr[i][j] == num ) {
                 System.out.println("Element found at index: (" +i+ ","+j+")");
                 status = true;
             }
         }
     }

     if(status == false) {
         System.out.println("Element not found");
     }


    }
}
