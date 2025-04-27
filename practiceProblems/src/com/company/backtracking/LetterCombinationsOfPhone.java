package com.company.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhone {
    private static Map<String, String> numberLetterMap = Map.ofEntries(
            Map.entry("2", "abc"),
            Map.entry("3", "def"),
            Map.entry("4", "ghi"),
            Map.entry("5", "jkl"),
            Map.entry("6", "mno"),
            Map.entry("7", "pqrs"),
            Map.entry("8", "tuv"),
            Map.entry("9", "wxyz")
    );

    public static List<String> letterCombinations(String digits) {
        if(digits.isBlank()) {
            return new ArrayList<>();
        }

        ArrayList<String> resultList = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        findLetters(digits, 0, stringBuilder, resultList);

        return resultList;
    }

    public static void findLetters(String input, int index, StringBuilder currentString, ArrayList<String> resultList) {
        if(currentString.length() == input.length()) {
            resultList.add(currentString.toString());
            return;
        }

        String numberLetters = numberLetterMap.get(Character.toString(input.charAt(index)));

        for(char c : numberLetters.toCharArray()) {
            currentString.append(c);
            findLetters(input, index + 1, currentString, resultList);
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }

    public static void main(String[] args) {
        String input = "2";

        System.out.println("Result = " + letterCombinations(input));
    }
}
