package com.company.maps;

import java.util.HashMap;

public class isIsomorphicString {
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> letterMap = new HashMap<>();

        for(int i =0; i < s.length(); i++) {
            Character sCurrentChar = s.charAt(i);
            Character tCurrentChar = t.charAt(i);

            if(letterMap.containsKey(sCurrentChar)) {
                if(!letterMap.get(sCurrentChar).equals(tCurrentChar)) {
                    return false;
                }
            } else {
                if (letterMap.containsValue(tCurrentChar)) {
                    return false;
                }
                letterMap.put(sCurrentChar, tCurrentChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "egg";

        System.out.println("Result = " + isIsomorphic(s1, s2));
    }
}
