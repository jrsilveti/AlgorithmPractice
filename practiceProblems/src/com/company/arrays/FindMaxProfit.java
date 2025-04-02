package com.company.arrays;

// [7,1,5,3,6,4]
// [7,100,1,5,3,6,4]

// [7,6,5,4,3,1]

//[]
//[1, -1, -3]

//keep track of lowest price I have seen

// <1,7>, <2,100>
public class FindMaxProfit {

    public static int findMaxProfit(int[] prices) {
        if(prices.length < 2) {
            return 0;
        }

        int max = 0;
        int lowestPrice = prices[0];

        for(int i =1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - lowestPrice);
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] input = {7,6,5,4,3,1};
        System.out.println("Solution = " + findMaxProfit(input));
    }
}
