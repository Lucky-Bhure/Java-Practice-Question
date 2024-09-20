package com.arraylist;

import java.util.ArrayList;
import java.util.List;

// Lucky Number in the matrix: the number which is smaller in row and larger in column

public class LuckyNumbers {

    static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>(1);

        int[] minimumE = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if(min >= matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            minimumE[i] = min;
        }

        int[] maximumE = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++) {
                if (max <= matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            maximumE[i] = max;
        }

        for (int i : minimumE) {
            for (int j : maximumE) {
                if ( i == j) {
                    result.add(i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}};
        System.out.println(luckyNumbers(matrix));

    }

}
