package com.company.strings;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        String result = "";
        int longestLength = 0;


        for(int i =0; i < s.length(); i++) {
            int left = i;
            int right = i;

            //odds use case
            while (!(left < 0) && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                String currentPalindrome = s.substring(left, right + 1);
                if(currentPalindrome.length() > longestLength) {
                    result = currentPalindrome;
                    longestLength = result.length();
                }
                left = left - 1;
                right = right + 1;
            }

            left = i;
            right = i + 1;
            //evens use case
            while (!(left < 0) && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                String currentPalindrome = s.substring(left, right + 1);
                if(currentPalindrome.length() > longestLength) {
                    result = currentPalindrome;
                    longestLength = result.length();
                }
                left = left - 1;
                right = right + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "cbbd";

        System.out.println("Solution = " + longestPalindrome(input));
    }
}
