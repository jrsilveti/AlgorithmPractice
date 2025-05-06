package com.company.priorityqueues;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        for(int i : nums) {
            priorityQueue.add(i);
        }

        int result = 0;
        for(int j = 0; j < k; j++) {
            result = priorityQueue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
         int[] inputArray = {3,2,3,1,2,4,5,5,6};
         int k = 4;

         System.out.println("Result = " + findKthLargest(inputArray, k));
    }
}
