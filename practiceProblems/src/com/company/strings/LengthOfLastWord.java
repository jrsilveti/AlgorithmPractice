package com.company.strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        int lastWordLength = 0;

        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!sb.isEmpty()) {
                    lastWordLength = sb.length();
                }
                sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));
                if(i == s.length() - 1) {
                    lastWordLength = sb.length();
                }
            }
        }

        return lastWordLength;
    }

    public static void main(String[] args) {
        String input = "Hello World";

        System.out.println("Result = " + lengthOfLastWord(input));
    }
}
