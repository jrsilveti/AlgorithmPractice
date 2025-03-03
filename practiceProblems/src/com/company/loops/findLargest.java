package com.company.loops;

public class findLargest {

    private static int findMaximum(int[] array) {
        int max = array[0];

        for(int i=0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findSecondMaximum(int[] array) {
        int max = Math.max(array[0], array[1]);
        int secondMax = Math.min(array[0], array[1]);

        for(int i=0; i < array.length; i++) {
            if(array[i] > max) {
                secondMax = Math.max(secondMax, max);
                max = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 8, 9, -1, 3};

        int max = findMaximum(array);
        System.out.println("Max = " + max);
        assert (max == 9);

        int secondMax = findSecondMaximum(array);
        System.out.println("secondMax = " + secondMax);
        assert (secondMax == 8);
    }
}
