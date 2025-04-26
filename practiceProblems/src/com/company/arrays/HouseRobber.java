package com.company.arrays;

//total loot if robbed n-2 = loot[n-2] + loot[n]
//total loot if robbed n-1 = loot[n-1]
//total loot at house n = max(totalLoot[n-2] + loot[n], totalLoot[n-1])
public class HouseRobber {
    public static int rob(int[] nums) {
        //base case
        if(nums.length < 2) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }

        return dp[nums.length - 1];
    }

    public static void main(String args[]) {

        int[] input = {2,7,9,3,1};

        System.out.println("Rob solution = " + rob(input));

    }
}
