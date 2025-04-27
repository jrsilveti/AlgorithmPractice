package com.company.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] input) {

        for(int i =0; i < input.length; i++) {
            int innerLoopLength = input.length - i;
            for(int j = 0; j < innerLoopLength - 1; j++) {
                if(input[j] > input[j+1]) {
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {2,8,5,3,9,4,1};

        System.out.println("Pre sort = " + Arrays.toString(input));
        bubbleSort(input);
        System.out.println("Post sort = " + Arrays.toString(input));
    }
}
