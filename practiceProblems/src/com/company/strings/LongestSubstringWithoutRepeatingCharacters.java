package com.company.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;

        HashSet<Character> charSet = new HashSet<>();

        int left = 0;
        int right = 0;

        while(right < s.length()) {

            char currentChar = s.charAt(right);

            if(!charSet.contains(currentChar)) {
                longest = Math.max(longest, s.substring(left, right + 1).length());
                charSet.add(currentChar);
                right += 1;
            } else {
                charSet.remove(s.charAt(left));
                left += 1;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input = "bbbbb";

        System.out.println("Solution = " + lengthOfLongestSubstring(input));
    }
}
