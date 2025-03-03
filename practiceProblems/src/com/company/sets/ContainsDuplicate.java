package com.company.sets;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            if (numberSet.contains(num)) {
                return true;
            } else {
                numberSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
