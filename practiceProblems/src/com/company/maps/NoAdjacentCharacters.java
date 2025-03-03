package com.company.maps;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Given a string QAACDE find a way to re-arrange the string such that no 2 adjacent characters are the same
// if it is not possible return the string "Not Possible" else return the new string
// I.E. QAACDE -> QACDEA
public class NoAdjacentCharacters {

    public static String checkStringForAdjacentDuplicates(String input) {

        HashMap<Character, Integer> characterMap = new LinkedHashMap<>();

        //put all chars in map with key as char and val as count so QAACDE -> <Q,1>, <A,2>, <C,1>, <D,1>, <E,1>
        for(int i = 0; i < input.length(); i++) {
            Character currentCharacter = input.charAt(i);
            if (characterMap.containsKey(currentCharacter)) {
                System.out.printf("Current char: %s already exists, updating count to %s%n",
                        currentCharacter,characterMap.get(currentCharacter) + 1);
                characterMap.put(currentCharacter, characterMap.get(currentCharacter) + 1);
            } else {
                System.out.printf("Current char: %s not found, setting count to 1%n", currentCharacter);
                characterMap.put(currentCharacter, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        boolean charactersAreRemaining = true;
        Character lastDuplicate = null;

        while (charactersAreRemaining) {
            for(Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
                Character currentChar = findNextDuplicate(lastDuplicate, characterMap);
                lastDuplicate = currentChar;
                if(currentChar != null && characterMap.get(currentChar) > 0) {
                    System.out.printf("Appending Current char: %s. count reduced to %s.%n", currentChar, characterMap.get(currentChar) - 1);
                    sb.append(currentChar);
                    characterMap.put(currentChar, characterMap.get(currentChar) - 1);
                }
            }
            charactersAreRemaining = false;
            for(Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
                Character currentChar = entry.getKey();
                if(characterMap.get(currentChar) > 0) {
                    charactersAreRemaining = true;
                }
            }
        }

        for(int i = 0; i < input.length() - 1; i++) {
            if (sb.toString().charAt(i) == sb.toString().charAt(i + 1)) {
                return "Not Possible";
            }
        }

        return sb.toString();
    }

    public static Character findNextDuplicate(Character lastDuplicate, Map<Character, Integer> inputMap) {
        int max = 0;
        Character biggestDupe = null;
        for(Map.Entry<Character, Integer> entry : inputMap.entrySet()) {
            if(entry.getValue() > max && entry.getKey() != lastDuplicate) {
                max = entry.getValue();
                biggestDupe = entry.getKey();
            }
        }
        return biggestDupe;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!!");
        System.out.println(checkStringForAdjacentDuplicates("QAAAACCCDE")); // QACADAEA
    }
}
