package com.jev;

import javax.tools.Tool;

public class Question1 {

   /* public static int Tool(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            for (int j=0;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    count++ ;
                }
            }
            if (count<=1){
                return i;
            }
            count=0;
        }


        return -1;
    }

    public static void main(String[] args) {
        String j ="aaaa";
        //System.out.println(j.length());
        //for (int i=0; i<)
        int ans= Tool(j);
        System.out.println(ans);
    }*/

        public static int findFirstNonRepeating(String s) {
            int[] charCount = new int[26]; // Assuming lowercase letters only

            // Count occurrences of each character
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Find the first non-repeating character
            for (int i = 0; i < s.length(); i++) {
                if (charCount[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1; // Return -1 if no non-repeating character is found
        }

        public static void main(String[] args) {
            String input = "aaaalah";
            int result = findFirstNonRepeating(input);

            if (result != -1) {
                System.out.println("The first non-repeating character is at index: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }



}
