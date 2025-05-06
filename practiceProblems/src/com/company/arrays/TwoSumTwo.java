package com.company.arrays;

import java.util.Arrays;

public class TwoSumTwo {
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2) {
            return new int[] {1,2};
        }

        int left = 0;
        int right = numbers.length - 1;
        int sum = numbers[left] + numbers[right];

        while (left < right) {
            if(sum == target) {
                int[] resultArray = new int[2];
                resultArray[0] = left + 1;
                resultArray[1] = right + 1;
                return resultArray;
            }else if(sum > target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
            sum = numbers[left] + numbers[right];
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] input = {2,3,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
