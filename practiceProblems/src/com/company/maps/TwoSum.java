package com.company.maps;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            if(sumMap.containsKey(target - nums[i])) {
                int leftIndex = sumMap.get(target - nums[i]);
                return new int[] {leftIndex, i};

            } else {
                sumMap.put(nums[i], i);
            }
        }
        return null;
    }
}
