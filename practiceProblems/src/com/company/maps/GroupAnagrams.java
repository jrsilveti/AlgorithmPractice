package com.company.maps;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(anagramMap.containsKey(sorted)) {
                anagramMap.get(sorted).add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                anagramMap.put(sorted, newList);
                resultList.add(newList);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        String[] input = {"a"};

        List<List<String>> result = groupAnagrams(input);

        for(List<String> s : result) {
            System.out.println(s);
        }
    }
}
