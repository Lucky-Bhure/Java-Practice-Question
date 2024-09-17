package com.practice;

import java.util.Arrays;

public class UncommonCharacterString {

    public static String[] uncommonFromSentences(String s1, String s2) {



        return new String[]{"aa", "AEae"};
    }

    public static void main(String[] args) {

        String s1 = "this apple apple is sweet";
        String s2 = "this apple is sour";

//        System.out.print(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        for (String i : str1) {
            System.out.println(i);
        }

    }

}
