package com.company.arrays;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int numBoats = 0;

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;

        while(left != right && left < right) {
            if(people[left] + people[right] <= limit) {
                numBoats++;
                left++;
                right--;
            } else {
                numBoats++;
                right--;
            }
        }

        if(left == right)
            numBoats++;

        return numBoats;
    }

    public static void main(String args[]) {

        int[] people = {1, 2};
        //1, 2 , 2 , 3

        int limit = 3;

        System.out.println("Num boats = " + numRescueBoats(people, limit));

    }
}
