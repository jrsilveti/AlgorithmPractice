package com.company.arrays;

public class NumArray {

    private int[] prefixArray;

    public NumArray(int[] nums) {
        prefixArray = new int[nums.length];

        for(int i=0; i < nums.length; i++) {
            prefixArray[i] = nums[i];
            if(i > 0) {
                prefixArray[i] = prefixArray[i] + prefixArray[i - 1];
            }
        }

    }

    public int sumRange(int left, int right) {
        if(left == 0) {
            return prefixArray[right];
        } else {
            return (prefixArray[right] - prefixArray[left - 1]);
        }
    }

    public static void main(String[] args) {
        int[] array = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(array);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        System.out.println(numArray.sumRange(0, 2));

        numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        System.out.println(numArray.sumRange(0, 5));

        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        System.out.println(numArray.sumRange(2, 5));
    }
}
