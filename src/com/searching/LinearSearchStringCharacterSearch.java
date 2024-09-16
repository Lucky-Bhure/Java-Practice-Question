package com.searching;

public class LinearSearchStringCharacterSearch {
    public static void main(String[] args) {

        String str = "Lucky";

        char c = 'l';
        boolean status = false;

        if(str.length() == 0) {
            System.out.println("Character not found");
        } else {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    System.out.println("Charater found at index: "+ i);
                    status = true;
                }
            }

            if(status == false) {
                System.out.println("Character not found");
            }
        }






    }
}
