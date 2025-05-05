package com.company.arrays;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        int maxGlobal = nums[0];
        int currentMax = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], nums[i] + currentMax);

            if(currentMax > maxGlobal) {
                maxGlobal = currentMax;
            }
        }


        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Result = " + maxSubArray(input));
    }
}
