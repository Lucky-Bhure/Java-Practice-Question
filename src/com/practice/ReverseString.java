package com.practice;

public class ReverseString {
    public static void main(String []args) {
        String str = "Hello";
        StringBuilder newStr = new StringBuilder(str);
        System.out.println("Reverse String: "+newStr.reverse());

        StringBuilder n = new StringBuilder();
        String str1 = "While";
        for(int i = str1.length()-1; i >= 0; i--) {
            n = n.append(str1.charAt(i));
        }

        System.out.println("Reverse String: "+n);
    }
}
