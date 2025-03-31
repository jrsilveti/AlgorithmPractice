package com.company.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    //solved in o(n) time with o(n) space
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }

        int longest = 0;

        for(int i : numSet) {
            //check if start of a sequence
            if(!numSet.contains(i - 1)) {
                int length = 1;
                while(numSet.contains(i + 1)) {
                    length += 1;
                    i = i + 1;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int [] input = {100,4,200,1,3,2};
        int longest = longestConsecutive(input);
        System.out.println("Longest = " + longest);
    }

}
